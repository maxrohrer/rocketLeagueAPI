package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Entities.Collectibles.Decal;
import com.max.rocketLeagueAPI.Repositories.DecalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/decals/{name}")
    public Decal getDecalByName(@PathVariable String name) {
        return decalRepository.findOneByName(name);
    }
}
