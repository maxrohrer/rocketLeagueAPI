package com.max.rocketLeagueAPI.Repositories;

import com.max.rocketLeagueAPI.Models.RocketTrail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RocketTrailRepository {
    List<RocketTrail> findByRarity(String rarity);
}
