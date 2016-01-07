package com.brocoding.nodragons.app.character.characterstate;

import com.brocoding.nodragons.app.effect.Effect;

/**
 * Created by X086353 on 1/7/2016.
 */

public class Debuff {
    private final String debuffName;
    private final Effect debuffEffect;

    public Debuff(String debuffName, Effect debuffEffect) {
        this.debuffName = debuffName;
        this.debuffEffect = debuffEffect;
    }
}
