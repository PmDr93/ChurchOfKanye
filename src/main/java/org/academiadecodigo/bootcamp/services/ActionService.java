package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.persistence.dao.jpa.ActionDaoJPA;
import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ActionService {

    private ActionDaoJPA actionDaoJPA;

    private Map<Integer, Actions> actionMap = new HashMap<>();

    public Map<Integer, Actions> getActionMap() {
        return actionMap;
    }

    @Autowired
    public void setActionDaoJPA(ActionDaoJPA actionDaoJPA) {
        this.actionDaoJPA = actionDaoJPA;
    }

    public void setActionMap(Map<Integer, Actions> actionMap) {
        this.actionMap = actionMap;
    }

    public Actions getAction(Integer id) {
       return actionDaoJPA.findById(id);
    }

    //add to a map
    public void addAction(Integer id, Actions action) {
        actionMap.put(id,action);
    }

    //add action to DataBase
    public void addActionToDB(Actions action) {
        actionDaoJPA.saveOrUpdate(action);
    }

    public void deleteAction(Actions action) {
        actionDaoJPA.delete(action.getId());
    }

}
