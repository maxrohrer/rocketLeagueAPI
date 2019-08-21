package com.max.rocketLeagueAPI.Repositories;

import com.max.rocketLeagueAPI.Entities.Collectibles.Topper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TopperRepository extends JpaRepository<Topper, Integer> {
    List<Topper> findByRarity(Optional<String> rarity);
}
