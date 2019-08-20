package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Models.RocketTrail;
import com.max.rocketLeagueAPI.Repositories.RocketTrailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RocketTrailController {
    @Autowired
    private RocketTrailRepository rocketTrailRepository;

    @GetMapping("/rocket-trails")
    public List<RocketTrail> getAllRocketTrails(@RequestParam(name = "rarity") Optional<String> rarity) {
//        TODO: add optional rarity param
        return rocketTrailRepository.findByRarity(rarity);
//        else return rocketTrailRepository.findAll();
    }
}
