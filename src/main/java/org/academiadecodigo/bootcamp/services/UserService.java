package org.academiadecodigo.bootcamp.services;


import org.academiadecodigo.bootcamp.persistence.dao.jpa.ActionDaoJPA;
import org.academiadecodigo.bootcamp.persistence.dao.jpa.UserDaoJPA;
import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.academiadecodigo.bootcamp.persistence.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserServiceInterface {

    private List<User> usersList = new ArrayList<>();


    @Override
    public List<User> getUsersList() {
        return usersList;
    }

    @Override
    public User getUser(Integer id) {
        return usersList.get(id - 1);
    }

    @Override
    public void add(User user) {
        usersList.add(user);
    }

    @Override
    public void delete(Integer id) {
        usersList.remove(id);
    }


    /* public void list() {
        usersList.forEach(System.out::println);
    }

    public List<Actions> getActionList(Integer id){
       return usersList.get(id).getActionsList();
    }*/

}
