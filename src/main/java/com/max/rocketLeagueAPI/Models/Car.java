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
    private String platform;
    @Column(name = "img_url")
    private String imgUrl;
    private boolean free;
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

    public String getPlatform() {
        return this.platform;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public boolean isFree() {
        return this.free;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }
}
