package com.brocoding.nodragons.domain.character.monster;

import com.brocoding.nodragons.domain.character.monster.ability.ActiveAbility;
import com.brocoding.nodragons.domain.character.monster.ability.PassiveAbility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

/**
 * Created by X086353 on 1/7/2016.
 */

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Template {
    public enum MonsterRank { MINION, BASIC, LIEUTENANT, BOSS };
    private final String name;
    private final int Id;
    private final MonsterRank rank;
    private final Statistics stats;
    private final List<PassiveAbility> passiveAbilities;
    private final List<ActiveAbility> activeAbilities;

    @JsonCreator
    public Template(@JsonProperty(value = "name") String name,
                    @JsonProperty(value = "id") int Id,
                    @JsonProperty(value = "rank") MonsterRank rank,
                    @JsonProperty(value = "stats") Statistics stats,
                    @JsonProperty(value = "passiveAbilities") List<PassiveAbility> passiveAbilities,
                    @JsonProperty(value = "activeAbilities") List<ActiveAbility> activeAbilities) {
        this.name = name;
        this.Id = Id;
        this.rank = rank;
        this.stats = stats;
        this.passiveAbilities = passiveAbilities;
        this.activeAbilities = activeAbilities;

    }
}
