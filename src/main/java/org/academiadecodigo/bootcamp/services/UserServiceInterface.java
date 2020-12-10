package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.persistence.model.*;


public interface UserServiceInterface {

    User getUser(Integer id);

    void add(User user);

    void delete(User user);

    void list();

}
