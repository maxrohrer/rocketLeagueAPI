package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Entities.Collectables.GoalExplosion;
import com.max.rocketLeagueAPI.Repositories.GoalExplosionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GoalExplosionController {
    @Autowired
    private GoalExplosionRepository goalExplosionRepository;

    @GetMapping("/goal-explosions")
    public List<GoalExplosion> getGoalExplosions(@RequestParam(name = "rarity") Optional<String> rarity) {
        if(rarity.isPresent()) { return goalExplosionRepository.findByRarity(rarity); }
        else return goalExplosionRepository.findAll();
    }
}
