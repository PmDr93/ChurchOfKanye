package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.persistence.model.User;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //Show main page
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String homePage(Model model) {
        User user = new User();

        user.setFirstName("Pedro");
        user.setLastName("Rafael");
        user.setUsername("pedro");
        user.setPassword("academia");
        user.setEmail("pedro@gmail.com");

        model.addAttribute("user", user);

        return "index";
    }


}
