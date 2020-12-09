package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.model.actions.Action5;
import org.academiadecodigo.bootcamp.model.actions.Actions;

public class BootStrap {

    private User user;
    private Actions action5;


    public void createUsersTest() {

        user = new User();
        user.setId(1);
        user.setFirstName("Pedro");
        user.setLastName("Rafael");
        user.setUsername("pedro");
        user.setMeter(50);
        user.setPoints(20);

        System.out.println(user.toString());


    }

    public void actionTest() {
        action5 = new Action5();

        action5.setId(1);
        action5.setName("Help Lady");
        action5.setDescription("Help old lady");
        action5.setComplete(true);
        //action5.setValue(5);

        System.out.println(action5.toString());

    }
}
