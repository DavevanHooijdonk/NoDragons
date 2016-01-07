package com.brocoding.nodragons.app.character.monster;

/**
 * Created by X086353 on 1/7/2016.
 */

public class Monster {

    private final MonsterTemplate monstertemplate;
    private final int monsterId;
    private final MonsterState monsterState;

    public Monster(MonsterTemplate monstertemplate, int monsterId, MonsterState monsterState) {
        this.monstertemplate = monstertemplate;
        this.monsterId = monsterId;
        this.monsterState = monsterState;
    }
}
