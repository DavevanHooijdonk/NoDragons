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
public class PassiveAbility {
    private final String name;
    private final int id;
    private final Effect effect;

    @JsonCreator
    public PassiveAbility(@JsonProperty(value = "name") String name,
                          @JsonProperty(value = "id") int id,
                          @JsonProperty(value = "effect") Effect effect) {
        this.name = name;
        this.id = id;
        this.effect = effect;
    }
}
