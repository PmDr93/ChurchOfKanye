package org.academiadecodigo.bootcamp.persistence.model.actions;

import javax.persistence.Entity;

@Entity
public class ShortAction extends Actions {

    private final int value = 5;


    @Override
    public String toString() {
        return "Action5{" +
                super.toString() + ", " +
                "value=" + value +
                '}';
    }
}
