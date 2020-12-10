package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.persistence.model.User;

public class Bootstrap {

    User user = new User();


    public void createUser() {
        user.setUsername("pedro");
        user.setFirstName("Pedro");
        user.setLastName("Rafael");
        user.setEmail("pmdr93@gamil.com");
        user.setId(1);
        user.setPassword("academia");
    }


}
