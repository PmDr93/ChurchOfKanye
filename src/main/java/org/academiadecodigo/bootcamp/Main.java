package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        BootStrap bootStrap = new BootStrap();

        bootStrap.createUsersTest();

        System.out.println("***********************************");

        bootStrap.actionTest();

        System.out.println("***********************************");

        bootStrap.deleteUserTest();

        System.out.println("***********************************");

        System.out.println(bootStrap.loginTest());

        System.out.println("***********************************");

        bootStrap.addActionTest();

        System.out.println("***********************************");

        bootStrap.deleteActionTest();

        System.out.println("***********************************");

        System.out.println(bootStrap.getActionTest(1));

        System.out.println("***********************************");

    }
}
