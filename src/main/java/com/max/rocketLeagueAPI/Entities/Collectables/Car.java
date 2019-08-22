package com.max.rocketLeagueAPI.Entities.Collectables;

import com.max.rocketLeagueAPI.Entities.Collectable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car extends Collectable {
    @Column(name = "body_type")
    private String bodyType;
    private String platform;

    public Car() {}

    public String getBodyType() { return bodyType; }

    public String getPlatform() { return this.platform; }
}
