package com.max.rocketLeagueAPI.Models;

import java.util.Date;

public class Car {
    private int id;
    private String name;
    private String style;
    private String rarity;
    private String imgUrl;
    private boolean specialEdition;
    private boolean free;
    private Date updatedAt;

    public Car() {}

    public String getName() {
        return this.name;
    }
}
