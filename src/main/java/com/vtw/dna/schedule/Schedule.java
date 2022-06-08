package com.vtw.dna.schedule;

import com.vtw.dna.movie.Movie;
import com.vtw.dna.theater.Theater;
import lombok.Getter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
public class Schedule { // 영화 상영관

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scheduleSeq; // 상영관 Id
    private long theaterId; // 영화관 Id
    private long movieId; // 영화 Id
    private Date time; // 영화 시간
    private long seats; // 좌석 수
    private long fee; // 금액

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "theaterId", referencedColumnName = "theaterId", nullable = false, insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Theater theater;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "movieId", referencedColumnName = "movieId", nullable = false, insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Movie movie;


    public Schedule update(Schedule newOne) {
        this.theaterId = newOne.theaterId;
        this.movieId = newOne.movieId;
        this.time = newOne.time;
        this.seats = newOne.seats;
        this.fee = newOne.fee;
        return this;
    }
}
