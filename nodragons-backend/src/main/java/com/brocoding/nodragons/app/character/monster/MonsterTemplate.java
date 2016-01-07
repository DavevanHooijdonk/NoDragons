package com.brocoding.nodragons.app.character.monster;

import com.brocoding.nodragons.app.character.monster.ability.ActiveAbility;
import com.brocoding.nodragons.app.character.monster.ability.PassiveAbility;
import com.brocoding.nodragons.app.character.monster.statistics.Statistics;

import java.util.List;

/**
 * Created by X086353 on 1/7/2016.
 */

public class MonsterTemplate {
    private final String name;
    private final int monsterTemplateId;
    private enum monsterRank { MINION, BASIC,LIEUTENANT, BOSS };
    private final Statistics stats;
    private final List<PassiveAbility> passiveAbilities;
    private final List<ActiveAbility> activeAbilities;


    public MonsterTemplate(String name, int monsterTemplateId, Statistics stats, List<ActiveAbility> activeAbilities, List<PassiveAbility> passiveAbilities) {
        this.name = name;
        this.monsterTemplateId = monsterTemplateId;
        this.stats = stats;
        this.passiveAbilities = passiveAbilities;
        this.activeAbilities = activeAbilities;

    }
}
