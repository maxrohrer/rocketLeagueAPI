package com.max.rocketLeagueAPI.Entities.Collectables;

import com.max.rocketLeagueAPI.Entities.Collectable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car extends Collectable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_id")
    private int id;
    @Column(name = "body_type")
    private String bodyType;
    private String platform;

    public Car() {}

    public int getId() {
        return this.id;
    }
    public String getPlatform() { return this.platform; }
}
