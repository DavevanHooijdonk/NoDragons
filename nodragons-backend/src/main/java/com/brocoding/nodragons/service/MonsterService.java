package com.brocoding.nodragons.service;

import com.brocoding.nodragons.domain.character.Monster;
import com.brocoding.nodragons.domain.character.monster.Template;

import java.util.Map;

/**
 * Created by X086353 on 1/7/2016.
 */

public interface MonsterService {

    void saveMonsterTemplate(int id,Template template);
    void saveMonster(int id,Monster monster);
    Template loadMonsterTemplate (int id);
    Monster loadMonster(int id);
    Map<Integer, Template> loadAllMonsterTemplates();
    Map<Integer, Monster> loadAllMonsters();
}
