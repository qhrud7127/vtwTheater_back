package com.vtw.dna.schedule.repository;

import com.vtw.dna.schedule.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ScheduleRepository extends JpaRepository<Schedule, Long>{
    List<Schedule> findAllByMovieId(long MovieId);

}
