package org.academiadecodigo.bootcamp.model.actions;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class Action5 extends Actions {

    int value = 5;


    @Override
    public String toString() {
        return "Action5{" +
                super.toString() + ", " +
                "value=" + value +
                '}';
    }
}
