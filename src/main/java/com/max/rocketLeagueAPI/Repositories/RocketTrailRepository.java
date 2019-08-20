package com.max.rocketLeagueAPI.Repositories;

import com.max.rocketLeagueAPI.Models.RocketTrail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RocketTrailRepository extends JpaRepository<RocketTrail, Integer> {
//    List<RocketTrail> findAll();
    List<RocketTrail> findByRarity(Optional<String> rarity);
}
