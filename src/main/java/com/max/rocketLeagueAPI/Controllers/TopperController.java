package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Entities.Collectables.Topper;
import com.max.rocketLeagueAPI.Repositories.TopperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TopperController {
    @Autowired
    private TopperRepository topperRepository;

    @GetMapping("/toppers")
    public List<Topper> getToppers(@RequestParam(name = "rarity") Optional<String> rarity) {
        if(rarity.isPresent()) { return topperRepository.findByRarity(rarity); }
        else return topperRepository.findAll();
    }
}
