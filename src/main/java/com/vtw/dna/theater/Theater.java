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
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String theaterId;
    private String theaterNm;
    private String address;

    public Theater update(Theater newOne) {
        this.theaterNm = newOne.theaterNm;
        this.address = newOne.address;
        return this;
    }
}
