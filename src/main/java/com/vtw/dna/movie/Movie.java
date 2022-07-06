package com.vtw.dna.movie;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Movie { // 영화

    @Id
    private String id; // 영화id
    private String title; // 영화명
    private String director; // 감독
    private String genre; // 장르
    private String grade; // 관람등급
    private String actor; // 배우
    private String runningTime; // 상영시간

/*
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Schedule> schedules = new ArrayList<>();
*/

    public Movie(String id, String title, String director, String grade, String genre, String actor, String runningTime) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.runningTime = runningTime;
        this.grade = grade;
        this.actor = actor;
    }


    public Movie update(Movie newOne) {
        this.id = newOne.id;
        this.title = newOne.title;
        this.director = newOne.director;
        this.genre = newOne.genre;
        this.runningTime = newOne.runningTime;
        this.grade = newOne.grade;
        this.actor = newOne.actor;
        return this;
    }
}
