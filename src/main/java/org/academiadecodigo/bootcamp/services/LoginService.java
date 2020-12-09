package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.User;

public class LoginService {

    private UserService userService;
    private User userOnLogin;


    //get user on Login
    public User getUserOnLogin() {
        return this.userOnLogin = userOnLogin;
    }

    //set usergit
    public void setUserService(UserService userService) {
        this.userService = userService;


    }

    //authenticating user
    public boolean authenticateUser(Integer id) {

        for (User user : userService.getUsersList()) {
            if (user.getId() == id) {
                System.out.println("YAY");
                return true;
            }
        }
        System.out.println("BUT NO");
        return false;
    }





}
