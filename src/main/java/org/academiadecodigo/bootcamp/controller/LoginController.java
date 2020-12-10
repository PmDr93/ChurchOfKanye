package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.services.LoginService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

    private LoginService loginService;
    private UserService userService;

    //Set Login Service
    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //get sign up page
    @RequestMapping(method = RequestMethod.GET, path = "/signup")
    public String getSignUpPage(Model model) {

        model.addAttribute("user", new User());

        return "main/signup";
    }


    //get page login
    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String getLoginPage() {
        return "main/login";
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
