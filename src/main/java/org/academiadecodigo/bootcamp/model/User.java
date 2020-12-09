package org.academiadecodigo.bootcamp.model;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private int meter;
    private int points;

    public User() {}


    //getters and setters
    public int getId(int i) {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName(String pedro) {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(String s) {
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
