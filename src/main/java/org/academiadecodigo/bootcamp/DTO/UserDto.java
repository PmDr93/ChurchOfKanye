package org.academiadecodigo.bootcamp.DTO;

import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class UserDto {

    private Integer id;

    @NotNull(message = "You need a First Name")
    @NotBlank(message = "You need a First Name")
    @Size(min=3, max=30)
    private String firstName;

    @NotNull(message = "You need a Last Name")
    @NotBlank(message = "You need a Last Name")
    @Size(min=3, max=30)
    private String lastName;

    @NotNull(message = "You need a Username")
    @NotBlank(message = "You need a Username")
    @Size(min=3, max=40)
    private String username;

    @NotNull(message = "You need a Password")
    @NotBlank(message = "You need a Password")
    @Size(min=3, max=50)
    private String password;

    @Email
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
