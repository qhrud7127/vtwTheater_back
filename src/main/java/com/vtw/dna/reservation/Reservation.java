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
    private String seat; // 예약 매수
    private String name; // 예약자
    private String password; // 비밀번호
    private String phone; //휴대폰번호
    private String birth; // 생년월일



    public Reservation update(Reservation newOne) {
        this.scheduleSeq = newOne.scheduleSeq;
        this.seat = newOne.seat;
        this.name = newOne.name;
        this.password = newOne.password;
        this.phone = newOne.phone;
        this.birth = newOne.birth;
        return this;
    }
}
