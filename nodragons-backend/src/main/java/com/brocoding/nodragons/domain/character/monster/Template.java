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
                    @JsonProperty(value = "activeAbilities") List<ActiveAbility> activeAbilities)
    {
        this.name = name;
        this.Id = Id;
        this.rank = rank;
        this.stats = stats;
        this.passiveAbilities = passiveAbilities;
        this.activeAbilities = activeAbilities;

        if (!isValid()) throw new IllegalArgumentException("Template is not valid");
    }

    private boolean isValid()
    {
        boolean valid = name != null && !name.isEmpty() && stats != null &&
                passiveAbilities != null && activeAbilities != null;
        // Check distinctiveness of id's (QQ can't neatly use a stream for this, because Java has no tuples to use with reduce).
        int[] ids = passiveAbilities.stream().mapToInt(ab -> ab.id).sorted().toArray();
        for (int i = 1; i < ids.length; i++) {
            if (ids[i-1] == ids[i]) valid = false;
        }
        if (!valid) return valid;
        ids = activeAbilities.stream().mapToInt(ab -> ab.id).sorted().toArray();
        for (int i = 1; i < ids.length; i++) {
            if (ids[i-1] == ids[i]) valid = false;
        }
        return valid;
    }
}
