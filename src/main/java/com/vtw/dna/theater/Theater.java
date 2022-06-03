package com.vtw.dna.theater;

import com.vtw.dna.employee.Gender;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Theater { // 극장

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String theaterId; // 극장 id
    private String theaterNm; // 극장 명
    private String address; // 극장 위치

    public Theater update(Theater newOne) {
        this.theaterNm = newOne.theaterNm;
        this.address = newOne.address;
        return this;
    }
}
