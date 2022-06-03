package com.vtw.dna.schedule.repository;

import com.vtw.dna.schedule.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer>{
/*

    Page<Movie> findAllByNameContains(Pageable pageable, String searchName);
*/

}
