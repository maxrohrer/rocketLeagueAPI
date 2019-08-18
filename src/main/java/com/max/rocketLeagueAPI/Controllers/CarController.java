package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Models.Car;
import com.max.rocketLeagueAPI.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/cars")
    public List<Car> getAllCars() {
//        TODO: add different calls to factory and logic to make calls based on filters in body
        return carRepository.findAll();
    }

    @GetMapping("/cars/{id}")
    public Car getCarById(int id) {
        return carRepository.findOne(id);
    }
}
