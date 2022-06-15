package com.vtw.dna.reservation;

import com.vtw.dna.movie.Movie;
import com.vtw.dna.schedule.Schedule;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
public class Reservation { // 영화 예약

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reservationSeq; // 예약 Seq
    private long scheduleSeq; // 스케쥴 Id
    private long seat; // 예약 매수
    private String name; // 예약자
    private String password; // 비밀번호
    private String phone; //휴대폰번호
    private String birth; // 생년월일

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "scheduleSeq", referencedColumnName = "scheduleSeq", nullable = false, insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Schedule schedule;


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
