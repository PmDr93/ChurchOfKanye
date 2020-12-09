package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.services.LoginService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/main")
public class LoginController {

    private LoginService loginService;
    private UserService userService;

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


    //get page login
    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String getLoginPage() {
        return "login";
    }


    //authenticate user and get page of user
    @RequestMapping(method = RequestMethod.GET, path = "/login/{username}")
    public String authenticateUser(@ModelAttribute String username, @ModelAttribute String pass, @ModelAttribute Integer id, Model model) {

        if (loginService.authenticateUser(username, pass)) {
            model.addAttribute("user", userService.getUser(id));
            return "user/userpage";
        }

        return "redirect:/main/login";
    }


}
