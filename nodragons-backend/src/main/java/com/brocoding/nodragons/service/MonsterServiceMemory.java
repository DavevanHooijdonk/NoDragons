package com.brocoding.nodragons.service;

import com.brocoding.nodragons.domain.character.Monster;
import com.brocoding.nodragons.domain.character.monster.Template;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by X086353 on 1/7/2016.
 */

@Service
public class MonsterServiceMemory implements MonsterService {

    private final Map<Integer, Template> templates = Collections.synchronizedMap(new HashMap<>());
    private final Map<Integer, Monster> monsters = Collections.synchronizedMap(new HashMap<>());

    @Override
    public void saveMonsterTemplate(int id, Template template) {
        templates.put(id, template);
    }

    @Override
    public void saveMonster(int id, Monster monster) {
       monsters.put(id, monster);
    }

    @Override
    public Template loadMonsterTemplate(int id) {
        return templates.get(id);
    }

    @Override
    public Monster loadMonster(int id) {
        return monsters.get(id);
    }

    @Override
    public Map<Integer,Template> loadAllMonsterTemplates() {
        return templates;
    }

    @Override
    public Map<Integer,Monster> loadAllMonsters() {
        return monsters;
    }
}
