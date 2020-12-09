package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.User;

public class LoginService {

    private UserService userService;

    //set user
    public void setUserService(UserService userService) {
        this.userService = userService;
    }



}
