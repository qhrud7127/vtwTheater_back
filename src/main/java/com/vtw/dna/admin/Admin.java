package com.vtw.dna.admin;

import com.vtw.dna.employee.Gender;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String password;

    public Admin update(Admin newOne) {
        this.password = newOne.password;
        return this;
    }
}
