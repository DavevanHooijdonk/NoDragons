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

import javax.servlet.http.HttpServletResponse;
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
        this.monsterService.mockMonsterTemplate();
    }

    @RequestMapping(value="/monstertemplate/{id}", method=RequestMethod.POST)
    public void saveMonsterTemplate(@PathVariable int id, @RequestBody Template template) {
        monsterService.saveMonsterTemplate(id, template);
    }

    @RequestMapping(value="/monstertemplate/{id}", method=RequestMethod.GET)
    public Template retrieveMonsterTemplate(@PathVariable int id, HttpServletResponse httpServletResponse) {
        Template template = monsterService.loadMonsterTemplate(id);
        if (template == null) httpServletResponse.setStatus(404);
        return template;
    }

    @RequestMapping(value="/monstertemplate/{id}", method=RequestMethod.DELETE)
    public void deleteMonsterTemplate(@PathVariable int id, HttpServletResponse httpServletResponse) {
        if ( ! monsterService.deleteMonsterTemplate(id))
            httpServletResponse.setStatus(404);
    }

    @RequestMapping(value="/monster/{id}", method=RequestMethod.POST)
    public void saveMonster(@PathVariable int id, @RequestBody Monster monster) {
        monsterService.saveMonster(id, monster);
    }

    @RequestMapping(value="/allmonstertemplates", method=RequestMethod.GET)
    public List<Template> retrieveAllMonsterTemplate() {
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
