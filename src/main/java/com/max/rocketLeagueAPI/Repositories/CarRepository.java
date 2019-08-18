package com.max.rocketLeagueAPI.Repositories;

import com.max.rocketLeagueAPI.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    // car filters
    List<Car> findByPlatform(String platform);
    List<Car> findByRarity(String rarity);
    List<Car> findByFree(boolean isFree);
    List<Car> findByRarityAndFree(String rarity, boolean isFree);
}
