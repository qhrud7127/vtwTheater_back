package com.vtw.dna.sample;

import com.vtw.dna.movie.repository.MovieRepository;
import com.vtw.dna.schedule.Schedule;
import com.vtw.dna.schedule.repository.ScheduleRepository;
import com.vtw.dna.theater.repository.TheaterRepository;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ScheduleInitializer implements SampleDataInitializer {

    private final ScheduleRepository repository;

    private final MovieRepository movieRepository;

    private final TheaterRepository theaterRepository;

    public ScheduleInitializer(ScheduleRepository repository, MovieRepository movieRepository, TheaterRepository theaterRepository) {
        this.repository = repository;
        this.movieRepository = movieRepository;
        this.theaterRepository = theaterRepository;
    }

    @Override
    public void generateData() {

        Schedule schedule1_1 = new Schedule(
                theaterRepository.getById(1L),
                movieRepository.getById(1L),
                LocalDateTime.of(2022,06,14, 10, 00),
                75,12000);

        create(schedule1_1);

        System.out.println(schedule1_1.toString());

    }

    private void create(Schedule schedule) {
        repository.save(schedule);
    }
}
