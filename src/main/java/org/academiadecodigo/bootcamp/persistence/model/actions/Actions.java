package org.academiadecodigo.bootcamp.persistence.model.actions;

import org.academiadecodigo.bootcamp.persistence.model.*;

import javax.persistence.*;

@Entity
@Table(name = "actions")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "action_type")
public abstract class Actions extends AbstractModel {

    private int actionValue;
    private String name;
    private String description;
    private boolean isComplete = false;

    @ManyToOne
    private User user;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValue() {
        return actionValue;
    }
    public void setValue(int value) {
        this.actionValue = value;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Actions{" +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }
}
