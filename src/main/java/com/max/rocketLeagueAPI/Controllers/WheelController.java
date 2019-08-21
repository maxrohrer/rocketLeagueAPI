package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Entities.Collectables.Wheel;
import com.max.rocketLeagueAPI.Repositories.WheelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class WheelController {
    @Autowired
    private WheelRepository wheelRepository;

    @GetMapping("/wheels")
    public List<Wheel> getWheels(@RequestParam(name = "rarity") Optional<String> rarity) {
        if(rarity.isPresent()) return wheelRepository.findByRarity(rarity);
        else return wheelRepository.findAll();
    }
}
