package com.brocoding.nodragons.app.character.monster;

import com.brocoding.nodragons.app.character.monster.ability.ActiveAbility;
import com.brocoding.nodragons.app.character.characterstate.Buff;
import com.brocoding.nodragons.app.character.characterstate.Debuff;

import java.util.List;
import java.util.Map;

/**
 * Created by X086353 on 1/7/2016.
 */

public class MonsterState {

    private final int currentHitpoints;
    private final List<Buff> buffs;
    private final List<Debuff> debuffs;
    private final Map<ActiveAbility, Integer> abilitiesOnCooldown;

    public MonsterState(int currentHitpoints, List<Buff> buffs, List<Debuff> debuffs, Map<ActiveAbility, Integer> abilitiesOnCooldown) {
        this.currentHitpoints = currentHitpoints;
        this.buffs = buffs;
        this.debuffs = debuffs;
        this.abilitiesOnCooldown = abilitiesOnCooldown;
    }
}
