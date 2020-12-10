package org.academiadecodigo.bootcamp.model;

import org.academiadecodigo.bootcamp.model.actions.Actions;

import java.util.LinkedList;
import java.util.List;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private int meter;
    private int points;
    private List<Actions> actionsList = new LinkedList<>();

    public User() {}


    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getMeter() {
        return meter;
    }
    public void setMeter(int meter) {
        this.meter = meter;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<Actions> getActionsList() {
        return actionsList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", meter=" + meter +
                ", points=" + points +
                '}';
    }
}
