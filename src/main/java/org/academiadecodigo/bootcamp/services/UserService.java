package org.academiadecodigo.bootcamp.services;


import org.academiadecodigo.bootcamp.persistence.dao.jpa.ActionDaoJPA;
import org.academiadecodigo.bootcamp.persistence.dao.jpa.UserDaoJPA;
import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.academiadecodigo.bootcamp.persistence.model.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    private UserDaoJPA userDaoJPA;
    private ActionDaoJPA actionDaoJPA;
    //private List<User> usersList = new ArrayList<>();

    //set userDao
    @Autowired
    public void setUserDaoJPA(UserDaoJPA userDaoJPA) {
        this.userDaoJPA = userDaoJPA;
    }


    //set ActionDao
    @Autowired
    public void setActionDaoJPA(ActionDaoJPA actionDaoJPA) {
        this.actionDaoJPA = actionDaoJPA;
    }

    @Override
    public List<User> getUsersList() {
        return userDaoJPA.findAll();
    }

    @Override
    public User getUser(Integer id) {
        return userDaoJPA.findById(id);
    }

    @Override
    public void add(User user) {
        userDaoJPA.saveOrUpdate(user);
    }

    @Override
    public void delete(Integer id) {
        userDaoJPA.delete(id);
    }


    /* public void list() {
        usersList.forEach(System.out::println);
    }

    public List<Actions> getActionList(Integer id){
       return usersList.get(id).getActionsList();
    }*/

}
