package com.max.rocketLeagueAPI.Repositories;

import com.max.rocketLeagueAPI.Entities.Collectables.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    // car filters
    List<Car> findByPlatform(Optional<String> platform);
    List<Car> findByRarity(Optional<String> rarity);
    List<Car> findByBodyType(Optional<String> bodyType);

    Car findOneByName(String name);
}
