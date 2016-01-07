package com.brocoding.nodragons.domain.character.monster.ability;

/**
 * Created by X086353 on 1/7/2016.
 */

public class ActiveAbility {
    private final String abilityName;
    private final int abilityId;
    private final int minimumDamage;
    private final int maximumDamage;
    private final Effect effect;

    public ActiveAbility(String abilityName, int abilityId, int minimumDamage, int maximumDamage, Effect effect) {
        this.abilityName = abilityName;
        this.abilityId = abilityId;
        this.minimumDamage = minimumDamage;
        this.maximumDamage = maximumDamage;
        this.effect = effect;
    }
}
