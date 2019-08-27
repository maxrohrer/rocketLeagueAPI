package com.max.rocketLeagueAPI.Entities.Collectables;

import com.max.rocketLeagueAPI.Entities.Collectable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cars")
public class Car extends Collectable {
//    TODO: add car_decals join decals on car_decals id match and join car_decal img_url as well
    // TODO: add full decal object list + car_decal image link as new entity list
    @Column(name = "body_type")
    private String bodyType;
    private String platform;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "car_decals",
            joinColumns = {@JoinColumn(name = "car_id")},
            inverseJoinColumns = {@JoinColumn(name = "decal_id")}
    )
    private List<Decal> decals;

    public Car() {}

    public String getBodyType() { return bodyType; }

    public String getPlatform() { return this.platform; }

    public List<Decal> getDecals() { return this.decals; }
}
