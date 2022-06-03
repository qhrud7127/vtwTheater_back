package com.vtw.dna.movie;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class Movie { // 영화

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String movieId; // 영화id
    private String director; // 감독
    private String title; // 영화명
    private String cast; // 출연진
    private String grade; // 관람등급
    private String information; // 영화설명
    private String runningTime; // 상영시간



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
