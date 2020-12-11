package org.academiadecodigo.bootcamp.persistence.model;

import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

public class User extends AbstractModel {

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private int meterPercent;
    private int points;

    private List<Actions> actionsList = new LinkedList<>();



    //getters and setters
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
    public int getMeterPercent() {
        return meterPercent;
    }
    public void setMeterPercent(int meterPercent) {
        this.meterPercent = meterPercent;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActionsList(List<Actions> actionsList) {
        this.actionsList = actionsList;
    }

    public List<Actions> getActionsList() {
        return actionsList;
    }

    public void addAction(Actions action) {
        actionsList.add(action);
        action.setUser(this);
    }

    public void removeAction(Actions action) {
        actionsList.remove(action);
        action.setUser(null);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", meter=" + meterPercent +
                ", points=" + points +
                ", actionsList=" + actionsList +
                '}';
    }
}
