package com.max.rocketLeagueAPI.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "rocketTrails")
public class RocketTrail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String rarity;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public String getRarity() { return this.rarity; }
    public String getImgUrl() { return this.imgUrl; }
    public Timestamp getUpdatedAt() { return this.updatedAt; }
}
