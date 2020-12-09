package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.actions.Actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionService {

    private Map<Integer, Actions> actionMap = new HashMap<>();


    public Actions getAction(Integer id) {
       return actionMap.get(id);
    }

    public void addAction(Integer id, Actions action) {
        actionMap.put(id,action);
    }

    public void deleteAction(Actions action) {
        actionMap.remove(action.getId());
    }


    public Actions getByValue(Integer value) {

        Actions action = null;

      List<Actions> valueList = new ArrayList<>(actionMap.values());

      for(Actions actions : valueList) {
          if(actions.getValue() > value) {
              action = actions;
          }
      }

      return action;
    }



}
