package com.brocoding.nodragons.app.character.monster.ability;

import com.brocoding.nodragons.app.effect.Effect;

/**
 * Created by X086353 on 1/7/2016.
 */

public class ActiveAbility {
    private final String abilityName;
    private final int abilityId;
    private final int minimumDamage;
    private final int maximumDamage;
    private final Effect abilityEffect;

    public ActiveAbility(String abilityName, int abilityId, int minimumDamage, int maximumDamage, Effect abilityEffect) {
        this.abilityName = abilityName;
        this.abilityId = abilityId;
        this.minimumDamage = minimumDamage;
        this.maximumDamage = maximumDamage;
        this.abilityEffect = abilityEffect;
    }
}
