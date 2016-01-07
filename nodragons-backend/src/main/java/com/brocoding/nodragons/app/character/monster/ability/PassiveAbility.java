package com.brocoding.nodragons.app.character.monster.ability;

import com.brocoding.nodragons.app.effect.Effect;

/**
 * Created by X086353 on 1/7/2016.
 */

public class PassiveAbility {
    private final String abilityName;
    private final int abilityId;
    private final Effect abilityEffect;

    public PassiveAbility(String abilityName, int abilityId, Effect abilityEffect) {
        this.abilityName = abilityName;
        this.abilityId = abilityId;
        this.abilityEffect = abilityEffect;
    }
}
