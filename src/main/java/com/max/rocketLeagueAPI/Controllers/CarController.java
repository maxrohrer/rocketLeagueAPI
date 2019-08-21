package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Entities.Car;
import com.max.rocketLeagueAPI.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class CarController {
    @Autowired
    private CarRepository carRepository;

//    TODO: see if a seperate method should be extracted from get cars route
    public void filterCarList(Map<String, String> params) {

    }

    @GetMapping("/cars")
    public List<Car> getCars(
            @RequestParam(name = "rarity") Optional<String> rarity,
            @RequestParam(name = "platform") Optional<String> platform
    ) {
        if(platform.isPresent()) { return carRepository.findByPlatform(platform); }
        else if(rarity.isPresent()) { return carRepository.findByRarity(rarity); }
        else return carRepository.findAll();
    }

    @GetMapping("/cars/{name}")
    public Car getCarById(@PathVariable String name) {
        return carRepository.findOneByName(name);
    }
}
