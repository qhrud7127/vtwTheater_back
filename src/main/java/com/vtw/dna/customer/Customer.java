package com.vtw.dna.customer;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Customer { //고객

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId; // id
    private String password; // pw
    private String name; // 이름
    private String birth; // 생년월일


    public Customer update(Customer newOne) {
        this.password = newOne.password;
        this.name = newOne.name;
        this.birth = newOne.birth;

        return this;
    }
}
