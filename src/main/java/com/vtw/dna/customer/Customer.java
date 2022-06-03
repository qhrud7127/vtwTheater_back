package com.vtw.dna.customer;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    private String password;
    private String name;
    private Date birth;
    private String address;
    private String phone;


    public Customer update(Customer newOne) {
        this.password = newOne.password;
        this.name = newOne.name;
        this.birth = newOne.birth;
        this.address = newOne.address;
        this.phone = newOne.phone;

        return this;
    }
}
