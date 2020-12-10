package org.academiadecodigo.bootcamp.DTO;

import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;

import java.util.List;

public class UserDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private List<Actions> actionsList;
    private int meterPercent;
    private int points;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Actions> getActionsList() {
        return actionsList;
    }

    public void setActionsList(List<Actions> actionsList) {
        this.actionsList = actionsList;
    }
}
