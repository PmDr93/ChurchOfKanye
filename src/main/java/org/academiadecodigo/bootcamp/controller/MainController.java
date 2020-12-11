package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.persistence.model.User;
import org.academiadecodigo.bootcamp.persistence.model.actions.LongAction;
import org.academiadecodigo.bootcamp.persistence.model.actions.ShortAction;
import org.academiadecodigo.bootcamp.services.ActionService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

    private UserService userService;
    private ActionService actionService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setActionService(ActionService actionService) {
        this.actionService = actionService;
    }

    //Show main page
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String homePage() {

        bootStrap();

        return "index";
    }

    public void bootStrap() {

        User user = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        user.setId(1);
        user.setFirstName("Pedro");
        user.setLastName("Rafael");
        user.setUsername("pedro");
        user.setPassword("academia");
        user.setEmail("pedro@gmail.com");

        user2.setId(2);
        user2.setFirstName("André");
        user2.setLastName("Duarte");
        user2.setUsername("andre");
        user2.setPassword("academia");
        user2.setEmail("andre@gmail.com");

        user3.setId(3);
        user3.setFirstName("Bruno");
        user3.setLastName("Almeida");
        user3.setUsername("bruno");
        user3.setPassword("academia");
        user3.setEmail("bruno@gmail.com");

        user4.setId(4);
        user4.setFirstName("Bruno");
        user4.setLastName("Almeida");
        user4.setUsername("bruno");
        user4.setPassword("academia");
        user4.setEmail("bruno@gmail.com");

        userService.add(user);
        userService.add(user2);
        userService.add(user3);
        userService.add(user4);

        LongAction longAction = new LongAction();
        ShortAction shortAction = new ShortAction();
        LongAction longAction1 = new LongAction();
        ShortAction shortAction1 = new ShortAction();
        LongAction longAction2 = new LongAction();
        ShortAction shortAction2 = new ShortAction();
        LongAction longAction3 = new LongAction();
        ShortAction shortAction3 = new ShortAction();
        LongAction longAction4 = new LongAction();
        ShortAction shortAction4 = new ShortAction();

        longAction.setId(1);
        longAction.setName("Pray");
        longAction.setDescription("Say a Prayer!");

        shortAction.setId(2);
        shortAction.setName("Feed the homeless");
        shortAction.setDescription("Buy someone a hot meal!");

        longAction1.setId(3);
        longAction1.setName("Donate");
        longAction1.setDescription("Donate something you don't wear anymore!");

        shortAction1.setId(4);
        shortAction1.setName("Help The Elderly");
        shortAction1.setDescription("Help someone cross the street!");

        longAction2.setId(5);
        longAction2.setName("Save Water");
        longAction2.setDescription("Brush your teeth with the water tap closed");

        shortAction2.setId(6);
        shortAction2.setName("Tell the truth");
        shortAction2.setDescription("Tell the truth about something you have been hiding");

        longAction3.setId(7);
        longAction3.setName("Love");
        longAction3.setDescription("Spread the Love! Tell someone how much they mean to you!");

        shortAction3.setId(8);
        shortAction3.setName("Apologize");
        shortAction3.setDescription("Apologize for something you did wrong");

        longAction4.setId(9);
        longAction4.setName("Sing");
        longAction4.setDescription("Sing to someone!");

        shortAction4.setId(10);
        shortAction4.setName("Give Flowers!");
        shortAction4.setDescription("Give flowers to your mom!");


        actionService.addAction(longAction.getId(),longAction);
        actionService.addAction(shortAction.getId(),shortAction);
        actionService.addAction(longAction1.getId(),longAction1);
        actionService.addAction(shortAction1.getId(),shortAction1);
        actionService.addAction(longAction2.getId(),longAction2);
        actionService.addAction(shortAction2.getId(),shortAction2);
        actionService.addAction(longAction3.getId(),longAction3);
        actionService.addAction(shortAction3.getId(),shortAction3);
        actionService.addAction(longAction4.getId(),longAction4);
        actionService.addAction(shortAction4.getId(),shortAction4);



    }


    //Show aboutus page
    @RequestMapping(method = RequestMethod.GET, path = "/aboutchurchofkanye")
    public String aboutUs() {
        return "aboutus";
    }


}
