package org.academiadecodigo.bootcamp.converters;

import org.academiadecodigo.bootcamp.DTO.UserDto;
import org.academiadecodigo.bootcamp.persistence.model.*;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DtoToUser {

    private UserService userService;
    
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    
    public User convert(UserDto userDto) {

        User user = (userDto.getId() != null ? userService.getUser(userDto.getId()) : new User());

        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setActionsList(userDto.getActionsList());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setMeterPercent(userDto.getMeterPercent());
        user.setPoints(userDto.getPoints());

        return user;
    }
    
}
