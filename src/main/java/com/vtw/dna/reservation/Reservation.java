package com.vtw.dna.reservation;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Reservation { // 영화 예약

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationSeq; // 예약 Seq
    private String scheduleSeq; // 상영관 Id
    private String userId; // 예약자 Id
    private String seat; // 예약 매수


    public Reservation update(Reservation newOne) {
        this.scheduleSeq = newOne.scheduleSeq;
        this.userId = newOne.userId;
        this.seat = newOne.seat;
        return this;
    }
}
