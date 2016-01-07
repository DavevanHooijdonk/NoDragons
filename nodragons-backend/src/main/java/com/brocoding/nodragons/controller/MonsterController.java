package com.brocoding.nodragons.controller;

import com.brocoding.nodragons.domain.character.Monster;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by X086353 on 1/7/2016.
 */

@RestController
public class MonsterController {

    @RequestMapping("/monster/{monsterId}")
    public String retrieveMonster(@PathVariable int monsterId) {
        return "Hello I am monster no ".concat(((Integer)monsterId).toString()).concat(".");
    }
}
