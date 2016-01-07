package com.brocoding.nodragons.domain.character.monster.ability;

/**
 * Created by X086353 on 1/7/2016.
 */

public class PassiveAbility {
    private final String abilityName;
    private final int abilityId;
    private final Effect effect;

    public PassiveAbility(String abilityName, int abilityId, Effect effect) {
        this.abilityName = abilityName;
        this.abilityId = abilityId;
        this.effect = effect;
    }
}
