package com.max.rocketLeagueAPI.Repositories;

import com.max.rocketLeagueAPI.Entities.Collectables.Wheel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WheelRepository extends JpaRepository<Wheel, Integer> {
    List<Wheel> findByRarity(Optional<String> rarity);
}
