package com.vtw.dna.schedule;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Schedule { // 영화 상영관

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scheduleSeq; // 상영관 Id
    private String theaterId; // 영화관 Id
    private String movieId; // 영화 Id
    private Date time; // 영화 시간
    private int seats; // 좌석 수


    public Schedule update(Schedule newOne) {
        this.theaterId = newOne.theaterId;
        this.movieId = newOne.movieId;
        this.time = newOne.time;
        this.seats = newOne.seats;
        return this;
    }
}
