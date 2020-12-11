package org.academiadecodigo.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {


    //Show main page
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String homePage() {
        return "index";
    }


    //Show aboutus page
    @RequestMapping(method = RequestMethod.GET, path = "/aboutchurchofkanye")
    public String aboutUs() {
        return "aboutus";
    }


}
