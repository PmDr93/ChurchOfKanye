package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.services.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/action")
public class ActionController {

    private ActionService actionService;


    //set action Service
    @Autowired
    public void setActionService(ActionService actionService) {
        this.actionService = actionService;
    }


    //see the actions list the user has to do
    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public String actionsList(Model model, @PathVariable Integer id) {

        model.addAttribute("action5", actionService.getAction(id));
        model.addAttribute("action10", actionService.getAction(id));

        return "actionlist";
    }





}
