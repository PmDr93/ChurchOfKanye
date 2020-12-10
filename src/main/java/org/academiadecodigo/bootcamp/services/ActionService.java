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

    public Actions getAction(Integer id) {
       return actionMap.get(id);
    }

    public void addAction(Integer id, Actions action) {
        actionMap.put(id,action);
    }

    public void deleteAction(Actions action) {
        actionMap.remove(action.getId());
    }

}
