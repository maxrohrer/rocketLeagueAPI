package com.max.rocketLeagueAPI.Entities;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
public class Collectable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
    private String name;
    private String rarity;
    @Column(name = "acquired_by")
    private String acquiredBy;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

//    public int getId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    public String getAcquiredBy() {
        return acquiredBy;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
}
