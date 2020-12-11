package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;
import org.academiadecodigo.bootcamp.services.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
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
