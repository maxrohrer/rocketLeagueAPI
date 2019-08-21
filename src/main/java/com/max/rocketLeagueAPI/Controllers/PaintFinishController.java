package com.max.rocketLeagueAPI.Controllers;

import com.max.rocketLeagueAPI.Entities.PaintFinish;
import com.max.rocketLeagueAPI.Repositories.PaintFinishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PaintFinishController {
    @Autowired
    private PaintFinishRepository paintFinishRepository;

    @GetMapping("/paint-finishes")
    public List<PaintFinish> getPaintFinishes(@RequestParam(name = "rarity")Optional<String> rarity) {
        if(rarity.isPresent()) return paintFinishRepository.findByRarity(rarity);
        else return paintFinishRepository.findAll();
    }

    @GetMapping("/paint-finishes/{name}")
    public PaintFinish getPaintFinishByName(@PathVariable String name) {
        return paintFinishRepository.findOneByName(name);
    }
}
