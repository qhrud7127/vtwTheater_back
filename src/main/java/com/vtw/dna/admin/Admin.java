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
public class Admin { //관리자

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId; // id
    private String password; // pw

    public Admin update(Admin newOne) {
        this.password = newOne.password;
        return this;
    }
}
