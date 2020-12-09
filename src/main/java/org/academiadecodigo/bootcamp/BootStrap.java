package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.model.actions.Action5;
import org.academiadecodigo.bootcamp.model.actions.Actions;
import org.academiadecodigo.bootcamp.services.ActionService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.academiadecodigo.bootcamp.services.LoginService;

public class BootStrap {

    private User user;
    private Actions action5;
    private UserService userService = new UserService();
    private ActionService actionService = new ActionService();

    public void createUsersTest() {

        user = new User();
        user.setId(1);
        user.setFirstName("Pedro");
        user.setLastName("Rafael");
        user.setUsername("pedro");
        user.setPassword("pedrito");
        user.setMeter(50);
        user.setPoints(20);

        addUser();

        System.out.println(user.toString());


    }

    public void actionTest() {
        action5 = new Action5();

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




}
