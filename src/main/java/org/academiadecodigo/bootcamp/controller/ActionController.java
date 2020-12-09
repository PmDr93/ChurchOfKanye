package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.services.ActionService;

public class ActionController {

    private ActionService actionService;


    //set action Service
    public void setActionService(ActionService actionService) {
        this.actionService = actionService;
    }
}
