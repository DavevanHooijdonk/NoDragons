package com.brocoding.nodragons.app.character.characterstate;

import com.brocoding.nodragons.app.effect.Effect;

/**
 * Created by X086353 on 1/7/2016.
 */

public class Buff {
    private final String buffName;
    private final Effect buffEffect;

    public Buff(String buffName, Effect buffEffect) {
        this.buffName = buffName;
        this.buffEffect = buffEffect;
    }
}
