package org.academiadecodigo.bootcamp.services;


import org.academiadecodigo.bootcamp.persistence.dao.jpa.ActionDaoJPA;
import org.academiadecodigo.bootcamp.persistence.dao.jpa.UserDaoJPA;
import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.academiadecodigo.bootcamp.persistence.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService implements UserServiceInterface {

    private Map<String, User> usersList = new HashMap<>();


    public List<User> getUsersList() {


        return null;
    }

    @Override
    public User getUser(Integer id) {
        return getUser(id);
    }

    @Override
    public void add(User user) {

        usersList.put(user.getUsername(), user);
    }


    @Override
    public void delete(Integer id) {
        usersList.remove(id);
    }


}
