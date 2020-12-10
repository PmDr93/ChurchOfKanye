package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.persistence.model.*;

import java.util.List;


public interface UserServiceInterface {

    User getUser(Integer id);

    void add(User user);

    void delete(Integer id);

    List<User> getUsersList();

}
