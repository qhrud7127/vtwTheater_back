package com.vtw.dna.devExtreme;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
public class DevExtreme { // 영화

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long devExtremeId; // 영화id
    private String  title; // 영화명
    private String  information; // 영화설명
    private String  grade; // 관람등급
    private Date    openDt; // 개봉일
    private long    seats; // 좌석수

    public DevExtreme(String title, String information, String grade, boolean screening, Date openDt, long seats) {
        this.title = title;
        this.information = information;
        this.grade = grade;
        this.openDt = openDt;
        this.seats = seats;
    }


    public DevExtreme update(DevExtreme newOne) {
        this.title = newOne.title;
        this.information = newOne.information;
        this.grade = newOne.grade;
        this.openDt = newOne.openDt;
        this.seats = newOne.seats;
        return this;
    }
}
