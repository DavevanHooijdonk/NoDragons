package com.brocoding.nodragons.domain.character.monster;

/**
 * Created by X086353 on 1/7/2016.
 */

public class Statistics {
    private final int maximumHitpoints;
    private final int zoneOfControl;
    private final int movementSpeed;
    private final int physicalResistance;
    private final int magicalResistance;
    private final int mentalResistance;

    public Statistics(int maximumHitpoints, int zoneOfControl, int movementSpeed, int physicalResistance, int magicalResistance, int mentalResistance) {
        this.maximumHitpoints = maximumHitpoints;
        this.zoneOfControl = zoneOfControl;
        this.movementSpeed = movementSpeed;
        this.physicalResistance = physicalResistance;
        this.magicalResistance = magicalResistance;
        this.mentalResistance = mentalResistance;
    }
}
