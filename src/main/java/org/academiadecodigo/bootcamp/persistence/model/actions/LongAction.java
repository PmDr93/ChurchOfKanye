package org.academiadecodigo.bootcamp.persistence.model.actions;


public class LongAction extends Actions {

    private final int value = 10;

    @Override
    public String toString() {
        return "Action10{" +
                super.toString() + ", " +
                "value=" + value +
                '}';
    }
}
