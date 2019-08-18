package com.max.rocketLeagueAPI.Repositories;

import com.max.rocketLeagueAPI.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
