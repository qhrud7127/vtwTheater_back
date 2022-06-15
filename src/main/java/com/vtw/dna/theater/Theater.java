package com.vtw.dna.theater;

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
public class Theater { // 극장

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long theaterId; // 극장 id
    private String theaterNm; // 극장 명
    private String address; // 극장 위치

    public Theater(String theaterNm, String address) {
        this.theaterNm = theaterNm;
        this.address = address;
    }


    public Theater update(Theater newOne) {
        this.theaterNm = newOne.theaterNm;
        this.address = newOne.address;
        return this;
    }
}
