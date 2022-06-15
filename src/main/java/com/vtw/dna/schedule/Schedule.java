package com.vtw.dna.schedule;

import com.vtw.dna.movie.Movie;
import com.vtw.dna.theater.Theater;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
public class Schedule { // 영화 상영관

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scheduleSeq; // 상영관 Id
    private long theaterId; // 영화관 Id
    private long movieId; // 영화 Id
    private LocalDateTime time; // 영화 시간
    private long seats; // 좌석 수
    private long remaining; // 남은 좌석 수
    private long fee; // 금액

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "theaterId", referencedColumnName = "theaterId", nullable = false, insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Theater theater;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "movieId", referencedColumnName = "movieId", nullable = false, insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Movie movie;


    public Schedule(Theater theater, Movie movie, LocalDateTime time, long seats, long fee){
        this.theater = theater;
        this.movie = movie;
        this.time = time;
        this.seats = seats;
        this.remaining = seats;
        this.fee = fee;
    }

    public Schedule update(Schedule newOne) {
        this.theaterId = newOne.theaterId;
        this.movieId = newOne.movieId;
        this.time = newOne.time;
        this.seats = newOne.seats;
        this.fee = newOne.fee;
        return this;
    }

    public Schedule updateSeats(Schedule newOne, long number) {
        this.scheduleSeq = newOne.scheduleSeq;
        this.theaterId = newOne.theaterId;
        this.movieId = newOne.movieId;
        this.time = newOne.time;
        this.seats = newOne.seats;
        this.fee = newOne.fee;
        this.remaining = this.remaining - number;
        return this;
    }
}
