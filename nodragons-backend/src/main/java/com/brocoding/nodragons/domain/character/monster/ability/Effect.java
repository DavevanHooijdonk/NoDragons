package com.brocoding.nodragons.domain.character.monster.ability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Created by X086353 on 1/7/2016.
 */

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Effect {

    private final String description;

    @JsonCreator
    public Effect(@JsonProperty(value = "description")String effectDescription) {
        this.description = effectDescription;

        if (!isValid()) throw new IllegalArgumentException("Effect is not valid");
    }

    private boolean isValid() {
        return true;
    }
}
