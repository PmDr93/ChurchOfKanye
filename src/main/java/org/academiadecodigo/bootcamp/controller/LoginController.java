package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.services.LoginService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/controller")
public class LoginController {

    private LoginService loginService;


    //Set Login Service
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }



    //get sign up page
    @RequestMapping(method = RequestMethod.GET, path = "/signup")
    public String getSignUpPage(Model model) {

        model.addAttribute("user", new User());

        return "signup";
    }


    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String getLoginPage(Model model) {



        return "login";
    }
}
