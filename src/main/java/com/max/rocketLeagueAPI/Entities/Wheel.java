package com.max.rocketLeagueAPI.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "wheels")
public class Wheel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "wheel_id")
    private int id;
    private String name;
    private String rarity;
    @Column(name = "acquired_by")
    private String acquiredBy;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRarity() { return rarity; }
    public String getAcquiredBy() { return acquiredBy; }
    public String getImgUrl() { return imgUrl; }
    public Timestamp getUpdatedAt() { return updatedAt; }
}