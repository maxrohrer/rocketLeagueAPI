package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Entities.Decal;
import com.max.rocketLeagueAPI.Repositories.DecalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DecalController {
    @Autowired
    private DecalRepository decalRepository;

    @GetMapping("/decals")
    public List<Decal> getDecals(@RequestParam(name = "rarity") Optional<String> rarity) {
        if(rarity.isPresent()) return decalRepository.findByRarity(rarity);
        else return decalRepository.findAll();
    }
}
