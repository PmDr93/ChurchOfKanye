package org.academiadecodigo.bootcamp.converters;

import org.academiadecodigo.bootcamp.DTO.ActionDto;
import org.academiadecodigo.bootcamp.persistence.model.actions.Actions;
import org.springframework.stereotype.Component;

@Component
public class ActionToDto {

    public ActionDto convert(Actions action ) {

        ActionDto actionDto = new ActionDto();

        actionDto.setId(action.getId());
        actionDto.setValue(action.getValue());
        actionDto.setName((action.getName()));
        actionDto.setComplete(action.isComplete());
        actionDto.setDescription(action.getDescription());

        return actionDto;

    }

}
