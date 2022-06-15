package com.vtw.dna.movie;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Duration;

@Entity
@Getter
@NoArgsConstructor
public class Movie { // 영화

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId; // 영화id
    private String title; // 영화명
    private String director; // 감독
    private String cast; // 출연진
    private String grade; // 관람등급
    private String information; // 영화설명
    private String runningTime; // 상영시간
    private String poster; // 포스터

    public Movie(String title, String director, String cast, String grade, String information, String runningTime, String poster) {
        this.title = title;
        this.director = director;
        this.cast = cast;
        this.runningTime = runningTime;
        this.grade = grade;
        this.information = information;
        this.runningTime = runningTime;
        this.poster = poster;
    }


    public Movie update(Movie newOne) {
        this.director = newOne.director;
        this.title = newOne.title;
        this.cast = newOne.cast;
        this.grade = newOne.grade;
        this.information = newOne.information;
        this.runningTime = newOne.runningTime;
        this.poster = newOne.poster;
        return this;
    }
}
