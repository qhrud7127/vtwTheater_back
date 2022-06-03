package com.vtw.dna.movie;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String movieId;
    private String director;
    private String title;
    private String cast;
    private String grade;
    private String information;
    private String runningTime;



    public Movie update(Movie newOne) {
        this.director = newOne.director;
        this.title = newOne.title;
        this.cast = newOne.cast;
        this.grade = newOne.grade;
        this.information = newOne.information;
        this.runningTime = newOne.runningTime;
        return this;
    }
}
