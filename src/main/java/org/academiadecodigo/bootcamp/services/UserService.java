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
public class UserService  {

    private Map<String, User> usersList = new HashMap<>();


    public List<User> getUsersList() {
        return new ArrayList<>();
    }


    public User getUserById() {

        return new User();

    }


    public User getUserByUsername(String username) {

        return new User();
    }


    public void add(User user) {

        usersList.put(user.getUsername(), user);
    }


    public void delete(String username) {
        usersList.remove(username);
    }


}
