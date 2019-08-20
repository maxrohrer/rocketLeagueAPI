package com.max.rocketLeagueAPI.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_id")
    private int id;
    private String name;
    @Column(name = "body_type")
    private String bodyType;
    private String rarity;
    @Column(name = "acquired_by")
    private String acquiredBy;
    private String platform;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public Car() {}

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getRarity() {
        return this.rarity;
    }
    public String getAcquiredBy() { return this.acquiredBy; }
    public String getPlatform() { return this.platform; }
    public String getImgUrl() {
        return this.imgUrl;
    }
    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }
}
