package com.max.rocketLeagueAPI.Repositories;

import com.max.rocketLeagueAPI.Entities.Collectables.GoalExplosion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GoalExplosionRepository extends JpaRepository<GoalExplosion, Integer> {
    List<GoalExplosion> findByRarity(Optional<String> rarity);
}
