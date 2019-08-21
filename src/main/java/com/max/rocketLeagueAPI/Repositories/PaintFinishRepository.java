package com.max.rocketLeagueAPI.Repositories;

import com.max.rocketLeagueAPI.Entities.Collectables.PaintFinish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaintFinishRepository extends JpaRepository<PaintFinish, Integer> {
    List<PaintFinish> findByRarity(Optional<String> rarity);

    PaintFinish findOneByName(String name);
}
