package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Models.Car;
import com.max.rocketLeagueAPI.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class CarController {

    @Autowired
    CarRepository carRepository;

//    TODO: see if a seperate method should be extracted from get cars route
    public void filterCarList(Map<String, String> params) {

    }

    @GetMapping("/cars")
    public List<Car> getAllCars(@RequestBody Map<String, String> body) {
        // return basic findAll if there are no filter params
        if(body.isEmpty()) return carRepository.findAll();
        // if platform is chosen return platform exlusive cars
        if(body.get("platform") != null) return carRepository.findByPlatform(body.get("platform"));
        // free and rarity filters
        if(body.get("isFree") != null) {
            boolean free = Boolean.parseBoolean(body.get("isFree"));
            if(body.get("rarity") != null) return carRepository.findByRarityAndFree(body.get("rarity"), free);
            else return carRepository.findByFree(free);
        }
    }

    @GetMapping("/cars/{id}")
    public Car getCarById(int id) {
        return carRepository.findOne(id);
    }
}
