package com.brocoding.nodragons.controller;

import com.brocoding.nodragons.domain.character.Monster;
import com.brocoding.nodragons.domain.character.monster.Statistics;
import com.brocoding.nodragons.domain.character.monster.Template;
import com.brocoding.nodragons.domain.character.monster.ability.ActiveAbility;
import com.brocoding.nodragons.domain.character.monster.ability.Effect;
import com.brocoding.nodragons.domain.character.monster.ability.PassiveAbility;
import com.brocoding.nodragons.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by X086353 on 1/7/2016.
 */

@RestController
public class MonsterController {
    private final MonsterService monsterService;

    @Autowired
    public MonsterController(MonsterService monsterService) {
        this.monsterService = monsterService;
    }

    @RequestMapping(value="/monstertemplate/{id}", method=RequestMethod.POST)
    public void saveMonsterTemplate(@PathVariable int id, @RequestBody Template template) {
        monsterService.saveMonsterTemplate(id, template);
    }

    @RequestMapping(value="/monster/{id}", method=RequestMethod.POST)
    public void saveMonster(@PathVariable int id, @RequestBody Monster monster) {
        monsterService.saveMonster(id, monster);
    }

    @RequestMapping(value="/monstertemplate/{id}", method=RequestMethod.GET)
    public Template retrieveMonsterTemplate(@PathVariable int id) {
        return monsterService.loadMonsterTemplate(id);
    }

    @RequestMapping(value="/allmonstertemplates", method=RequestMethod.POST)
    public List<Template> retrieveAllMonsterTemplate() {
        monsterService.mockMonsterTemplate();
        return monsterService.loadAllMonsterTemplates();
    }

    @RequestMapping(value="/monster/{id}", method=RequestMethod.GET)
    public Monster retrieveMonster(@PathVariable int id) {
        return monsterService.loadMonster(id);
    }

    @RequestMapping(value="/allmonsters", method=RequestMethod.GET)
    public List<Monster> retrieveAllMonsters() {
        return monsterService.loadAllMonsters();
    }
}
