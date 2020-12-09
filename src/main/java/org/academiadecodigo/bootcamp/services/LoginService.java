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

    public boolean authenticateUser(String username, String password) {

        for (User user : userService.getUsersList()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password) ) {
                userOnLogin = user;
                return true;
            }
        }
        return false;
    }





}
