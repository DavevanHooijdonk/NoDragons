package com.brocoding.nodragons.domain.character.monster;

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
public class Statistics {
    private final int maximumHitpoints;
    private final int zoneOfControl;
    private final int movementSpeed;
    private final int physicalResistance;
    private final int magicalResistance;
    private final int mentalResistance;

    @JsonCreator
    public Statistics(@JsonProperty(value = "maximumHitpoints") int maximumHitpoints,
                      @JsonProperty(value = "zoneOfControl") int zoneOfControl,
                      @JsonProperty(value = "movementSpeed") int movementSpeed,
                      @JsonProperty(value = "physicalResistance") int physicalResistance,
                      @JsonProperty(value = "magicalResistance") int magicalResistance,
                      @JsonProperty(value = "mentalResistance") int mentalResistance) {
        this.maximumHitpoints = maximumHitpoints;
        this.zoneOfControl = zoneOfControl;
        this.movementSpeed = movementSpeed;
        this.physicalResistance = physicalResistance;
        this.magicalResistance = magicalResistance;
        this.mentalResistance = mentalResistance;

        if (!isValid()) throw new IllegalArgumentException("Statistics is not valid");
    }

    private boolean isValid()
    {
        return maximumHitpoints >= 0 && zoneOfControl >= 0 && movementSpeed >= 0;
    }
}
