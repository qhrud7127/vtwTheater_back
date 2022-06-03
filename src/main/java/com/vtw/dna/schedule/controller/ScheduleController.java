package com.vtw.dna.schedule.controller;

import com.vtw.dna.reservation.Reservation;
import com.vtw.dna.schedule.Schedule;
import com.vtw.dna.schedule.repository.ScheduleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleRepository repository;

/*    @GetMapping
    public Page<Movie> list(@RequestParam("page") int page,
                            @RequestParam("size") int size,
                            @RequestParam(value = "sortBy", defaultValue = "userId") String sortBy,
                            @RequestParam(value = "sortDir", defaultValue = "asc") String sortDir,
                            @RequestParam(value = "filter", defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortDir), sortBy));
        Page<Movie> movie = repository.findAllByNameContains(pageable, filter);
        return movie;
    }*/

    @GetMapping("/{userId}")
    public Schedule find(@PathVariable Integer scheduleSeq) {
        Schedule schedule = repository.findById(scheduleSeq).orElseThrow();
        return schedule;
    }

    @PostMapping
    public Schedule create(@RequestBody Schedule newOne) {
       /* repository.save(newOne);*/
        System.out.println(newOne.toString());
        return newOne;
    }

    @PutMapping("/{userId}")
    public Schedule update(@PathVariable Integer scheduleSeq, @RequestBody Schedule newOne) {
        Schedule oldOne = repository.findById(scheduleSeq).orElseThrow();
        oldOne.update(newOne);
        repository.save(oldOne);
        return oldOne;
    }

    @DeleteMapping("/{userId}")
    public Schedule update(@PathVariable Integer scheduleSeq) {
        Schedule oldOne = repository.findById(scheduleSeq).orElseThrow();
        repository.delete(oldOne);
        return oldOne;
    }

}
