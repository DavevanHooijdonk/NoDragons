package com.brocoding.nodragons.service;

import com.brocoding.nodragons.domain.character.Monster;
import com.brocoding.nodragons.domain.character.monster.Template;

import java.util.List;

/**
 * Created by X086353 on 1/7/2016.
 */

public interface MonsterService {

    void saveMonsterTemplate(int id,Template template);
    void saveMonster(int id,Monster monster);
    Template loadMonsterTemplate(int id);
    boolean deleteMonsterTemplate(int id);
    int createMonsterTemplate();
    Monster loadMonster(int id);
    List<Template> loadAllMonsterTemplates();
    List<Monster> loadAllMonsters();

    //Should be removed later
    void mockMonsterTemplate();
}
