package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.User;

public class LoginService {

    private UserService userService;
    private User userOnLogin;


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


    public User getUserOnLogin() {
        return userOnLogin;
    }
}
