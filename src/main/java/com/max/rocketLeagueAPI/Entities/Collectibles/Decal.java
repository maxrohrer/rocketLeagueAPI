package com.max.rocketLeagueAPI.Entities.Collectibles;

import com.max.rocketLeagueAPI.Entities.Collectable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "decals")
public class Decal extends Collectable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "decal_id")
    private int id;

    public int getId() {
        return id;
    }
}
