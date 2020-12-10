package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.controller.ActionController;
import org.academiadecodigo.bootcamp.controller.LoginController;
import org.academiadecodigo.bootcamp.controller.MainController;
import org.academiadecodigo.bootcamp.controller.UserController;
import org.academiadecodigo.bootcamp.persistence.model.User;
import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;
import org.academiadecodigo.bootcamp.persistence.model.actions.LongAction;
import org.academiadecodigo.bootcamp.persistence.model.actions.ShortAction;
import org.academiadecodigo.bootcamp.services.ActionService;
import org.academiadecodigo.bootcamp.services.UserService;

import org.academiadecodigo.bootcamp.services.LoginService;

public class BootStrap {

    private User user;
    private Actions action5;
    private UserService userService = new UserService();
    private ActionService actionService = new ActionService();
    private MainController mainController = new MainController();
    private UserController userController = new UserController();
    private LoginController loginController = new LoginController();
    private ActionController actionController = new ActionController();

    public void createUsersTest() {

        user = new User();
        user.setId(1);
        user.setFirstName("Pedro");
        user.setLastName("Rafael");
        user.setUsername("pedro");
        user.setPassword("pedrito");
        user.setMeterPercent(50);
        user.setPoints(20);

        addUser();

        System.out.println(user.toString());


    }

    public void actionTest() {
        action5 = new ShortAction();

        action5.setId(1);
        action5.setName("Help Lady");
        action5.setDescription("Help old lady");
        action5.setComplete(true);

        System.out.println(action5.toString());

    }

    public void addUser() {
        userService.add(user);

        if(userService.getUsersList().contains(user)){
            System.out.println("Add Sucessfull");
        }
        else {
            System.out.println("Add Failed");
        }
    }

    public void deleteUserTest() {
        userService.delete(user);

        if(!userService.getUsersList().contains(user)){
            System.out.println("Delete Sucessfull");
        }
        else {
            System.out.println("Delete Failed");
        }
    }

    public boolean loginTest() {

        addUser();

        LoginService loginService = new LoginService();
        loginService.setUserService(userService);
        return loginService.authenticateUser("pedro", "pedrito");

    }

    public void addActionTest() {
        actionService.addAction(action5.getId(),action5);

        if(actionService.getActionMap().containsValue(action5)){
            System.out.println("Action Add Sucessfull");
        }
        else {
            System.out.println("Action Add Failed");
        }
    }

    public void deleteActionTest() {
        actionService.deleteAction(action5);

        if(!actionService.getActionMap().containsValue(action5)){
            System.out.println("Action Delete Sucessfull");
        }
        else {
            System.out.println("Action Delete Failed");
        }
    }

    public Actions getActionTest(Integer id) {
        actionTest();
        return actionService.getAction(id);
    }

    public void MainControllerTest() {
        System.out.println(mainController.homePage());
    }


    public void getActionTest() {

        LongAction longAction = new LongAction();
        ShortAction shortAction = new ShortAction();
        LongAction longAction1 = new LongAction();
        ShortAction shortAction1 = new ShortAction();
        LongAction longAction2 = new LongAction();
        ShortAction shortAction2 = new ShortAction();

        longAction.setName("Teste1");
        longAction.setId(1);
        longAction.setDescription("Teste 1");

        shortAction.setName("Teste2");
        shortAction.setId(2);
        shortAction.setDescription("Teste 2");

        longAction1.setName("Teste1");
        longAction1.setId(3);
        longAction1.setDescription("Teste 1");

        shortAction1.setName("Teste2");
        shortAction1.setId(4);
        shortAction1.setDescription("Teste 2");

        longAction2.setName("Teste1");
        longAction2.setId(5);
        longAction2.setDescription("Teste 1");

        shortAction2.setName("Teste2");
        shortAction2.setId(6);
        shortAction2.setDescription("Teste 2");

        actionService.addAction(1,longAction);
        actionService.addAction(2,shortAction);
        actionService.addAction(3,longAction1);
        actionService.addAction(4, shortAction1);
        actionService.addAction(5, longAction2);
        actionService.addAction(6, shortAction2);


        actionController.setActionService(actionService);

        System.out.println(actionController.getAction());

    }

    public void UserGetAction() {

        userController.setUserService(userService);
        actionController.setActionService(actionService);
        userController.setActionController(actionController);

        userController.getAction(2);

        System.out.println(userService.getActionList(1));

    }


}
