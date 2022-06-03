package com.vtw.dna.room;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String roomId;
    private String theaterId;
    private String movieId;
    private Date date;
    private Date time;
    private int seats;


    public Room update(Room newOne) {
        this.theaterId = newOne.theaterId;
        this.movieId = newOne.movieId;
        this.seats = newOne.seats;
        return this;
    }
}
