package com.max.rocketLeagueAPI.Repositories;

import com.max.rocketLeagueAPI.Entities.Collectibles.Decal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DecalRepository extends JpaRepository<Decal, Integer> {
    List<Decal> findByRarity(Optional<String> rarity);

    Decal findOneByName(String name);
}
