package org.academiadecodigo.bootcamp.model.actions;

public abstract class Actions {

    private int id;
    private int value;
    private String name;
    private String description;
    private Boolean isComplete = false;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean getComplete() {
        return isComplete;
    }
    public void setComplete(Boolean complete) {
        isComplete = complete;
    }


}
