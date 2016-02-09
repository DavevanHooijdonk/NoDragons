package com.brocoding.nodragons.service;

import com.brocoding.nodragons.domain.character.Monster;
import com.brocoding.nodragons.domain.character.monster.Statistics;
import com.brocoding.nodragons.domain.character.monster.Template;
import com.brocoding.nodragons.domain.character.monster.ability.ActiveAbility;
import com.brocoding.nodragons.domain.character.monster.ability.Effect;
import com.brocoding.nodragons.domain.character.monster.ability.PassiveAbility;
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
    public List<Template> loadAllMonsterTemplates() {
        return new ArrayList<>(templates.values());
    }

    @Override
    public List<Monster> loadAllMonsters() {
        return new ArrayList<>(monsters.values());
    }

    //Should be removed later
    @Override
    public void mockMonsterTemplate() {
        List<PassiveAbility> pa = new ArrayList<>();
        pa.add(new PassiveAbility("banana throw",10,new Effect("bla")));
        pa.add(new PassiveAbility("banana go",11,new Effect("blabla")));
        List<ActiveAbility> aa = new ArrayList<>();
        aa.add(new ActiveAbility("banana crit",10,5,50,new Effect("blaCRIT")));
        this.saveMonsterTemplate(12,new Template("GOD",12, Template.MonsterRank.BOSS,new Statistics(12,4,4,0,0,0),pa,aa));
        this.saveMonsterTemplate(14,new Template("GOD2",14, Template.MonsterRank.BOSS,new Statistics(12,4,4,0,0,0),pa,aa));
        this.saveMonsterTemplate(16,new Template("GOD3",16, Template.MonsterRank.BOSS,new Statistics(12,4,4,0,0,0),pa,aa));
    }
}
