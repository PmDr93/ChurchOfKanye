package org.academiadecodigo.bootcamp.services;


import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ActionService {


    private Map<Integer, Actions> actionMap = new HashMap<>();

    public Map<Integer, Actions> getActionMap() {
        return actionMap;
    }


    public void setActionMap(Map<Integer, Actions> actionMap) {
        this.actionMap = actionMap;
    }


    //add to a map
    public void addAction(Integer id, Actions action) {
        actionMap.put(id,action);
    }


}
