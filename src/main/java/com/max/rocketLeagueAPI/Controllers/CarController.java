package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Entities.Collectables.Car;
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
            @RequestParam(name = "body-type") Optional<String> bodyType,
            @RequestParam(name = "rarity") Optional<String> rarity,
            @RequestParam(name = "platform") Optional<String> platform
    ) {
        if(platform.isPresent()) return carRepository.findByPlatform(platform);
        else if(rarity.isPresent()) return carRepository.findByRarity(rarity);
        else if(bodyType.isPresent()) return carRepository.findByBodyType((bodyType));
        else return carRepository.findAll();
    }

    @GetMapping("/cars/{name}")
    public Car getCarById(@PathVariable String name) {
        return carRepository.findOneByName(name);
    }
}
