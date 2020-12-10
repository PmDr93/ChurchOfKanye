package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.converters.UserToDto;
import org.academiadecodigo.bootcamp.persistence.model.*;
import org.academiadecodigo.bootcamp.services.LoginService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class LoginController {

    private LoginService loginService;
    private UserService userService;
    private UserToDto userToDto;

    @Autowired
    //Set Login Service
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    //get sign up page
    @RequestMapping(method = RequestMethod.GET, path = "/signup")
    public String signUpButton(Model model) {

        model.addAttribute("user", new User());

        return "sign-up";
    }

    //cancel button from sign-up
    @RequestMapping(method = RequestMethod.POST, path = "/signup", params = "action=cancel")
    public String cancelSignUpButton() {
        return "redirect:/";
    }

    //cancel button from sign-up
    @RequestMapping(method = RequestMethod.POST, path = "/signup", params = "action=save")
    public String signUpButtonRedirect(@ModelAttribute("user") User user) {

        User user1 = userService.getUser(user.getId());


        return "redirect:/main" + user1.getId();
    }

    //get page login
    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String getLoginPage() {
        return "login";
    }

    //cancel button from login
    @RequestMapping(method = RequestMethod.POST, path = "/login", params = "action=cancel")
    public String cancelSignUpButtonFromLogin() {
        return "redirect:/";
    }


    //authenticate user and get page of user
    @RequestMapping(method = RequestMethod.POST, path = "/login", params = "action=getUserPage")
    public String authenticateUser(Model model, @ModelAttribute String username, @ModelAttribute String pass) {

        if (loginService.authenticateUser(username, pass)) {
            model.addAttribute("user", loginService.getUserOnLogin());
            return "redirect:/main" + loginService.getUserOnLogin().getId();
        }

        return "login";
    }


    //get user page
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String getUserPage(@PathVariable Integer id, Model model) {

        model.addAttribute("user", userService.getUser(id));

        return "login";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public String userList(Model model) {

        model.addAttribute("users", userService.getUsersList());

        return "list";

    }
}
