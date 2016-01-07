package com.brocoding.nodragons.domain.character;

import com.brocoding.nodragons.domain.character.monster.State;
import com.brocoding.nodragons.domain.character.monster.Template;

/**
 * Created by X086353 on 1/7/2016.
 */

public class Player {

    private final Template template;
    private final int Id;
    private final State state;

    public Player(Template template, int Id, State state) {
        this.template = template;
        this.Id = Id;
        this.state = state;
    }
}
