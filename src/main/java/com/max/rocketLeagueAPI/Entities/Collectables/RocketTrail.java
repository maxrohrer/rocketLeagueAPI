package com.max.rocketLeagueAPI.Entities.Collectables;

import com.max.rocketLeagueAPI.Entities.Collectable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rocket_trails")
public class RocketTrail extends Collectable { }
