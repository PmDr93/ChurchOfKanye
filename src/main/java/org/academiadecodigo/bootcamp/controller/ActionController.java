package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.actions.Actions;
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

    public Actions getAction() {

        double num  = Math.ceil(Math.random()*5);
        int  num2 = (int)num;

        return actionService.getAction(num2);
    }

}
