package org.academiadecodigo.bootcamp.converters;

import org.academiadecodigo.bootcamp.DTO.UserDto;
import org.academiadecodigo.bootcamp.persistence.model.*;
import org.springframework.stereotype.Component;

@Component
public class UserToDto {

    public UserDto convert(User user) {

        UserDto userDto = new UserDto();

        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setActionsList(user.getActionsList());
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        userDto.setMeterPercent(user.getMeterPercent());
        userDto.setPoints(user.getPoints());

        return userDto;
    }



}
