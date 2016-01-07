package com.brocoding.nodragons.domain.character.monster;

import com.brocoding.nodragons.domain.character.monster.ability.ActiveAbility;
import com.brocoding.nodragons.domain.character.monster.ability.PassiveAbility;

import java.util.List;

/**
 * Created by X086353 on 1/7/2016.
 */

public class Template {
    private final String name;
    private final int Id;
    private enum monsterRank { MINION, BASIC,LIEUTENANT, BOSS };
    private final Statistics stats;
    private final List<PassiveAbility> passiveAbilities;
    private final List<ActiveAbility> activeAbilities;


    public Template(String name, int Id, Statistics stats, List<ActiveAbility> activeAbilities, List<PassiveAbility> passiveAbilities) {
        this.name = name;
        this.Id = Id;
        this.stats = stats;
        this.passiveAbilities = passiveAbilities;
        this.activeAbilities = activeAbilities;

    }
}
