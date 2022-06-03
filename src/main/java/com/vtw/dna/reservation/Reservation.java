package com.vtw.dna.reservation;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationSeq;
    private String roomId;
    private String userId;
    private String seat;


    public Reservation update(Reservation newOne) {
        this.roomId = newOne.roomId;
        this.userId = newOne.userId;
        this.seat = newOne.seat;
        return this;
    }
}
