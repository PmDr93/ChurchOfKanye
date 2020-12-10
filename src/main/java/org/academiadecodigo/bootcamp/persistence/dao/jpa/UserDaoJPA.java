package org.academiadecodigo.bootcamp.persistence.dao.jpa;

import org.academiadecodigo.bootcamp.persistence.model.*;
import org.academiadecodigo.bootcamp.persistence.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoJPA extends GenericDao<User> implements UserDao {

    public UserDaoJPA() {
        super(User.class);
    }
}
