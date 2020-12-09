package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.User;

import java.util.List;

public interface UserServiceInterface {

    User getUser(Integer id);

    //add user to the list
    void add(User user);

    void delete(User user);

    void list();

}
