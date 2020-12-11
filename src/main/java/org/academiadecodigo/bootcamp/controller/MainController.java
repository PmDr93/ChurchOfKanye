package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.persistence.model.User;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    private UserService userService = new UserService();



    //Show main page
     @RequestMapping(method = RequestMethod.GET, path = "/")
     public String homePage() {
     User user = new User();
     user.setUsername("pedro");
     user.setFirstName("Pedro");
     user.setLastName("Rafael");
     user.setEmail("pmdr93@gamil.com");
     user.setId(1);
     user.setPassword("academia");
     userService.add(user);

     return "index";

     }



    //get page about us
    @RequestMapping(method = RequestMethod.GET, path = "/aboutchurchofkanye")
    public String getLoginPage() {
        return "aboutus";
    }


}
