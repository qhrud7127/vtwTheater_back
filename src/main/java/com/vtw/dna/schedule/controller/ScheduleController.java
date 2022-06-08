package com.vtw.dna.schedule.controller;

import com.vtw.dna.movie.Movie;
import com.vtw.dna.reservation.Reservation;
import com.vtw.dna.schedule.Schedule;
import com.vtw.dna.schedule.repository.ScheduleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleRepository repository;

    @GetMapping
    public Page<Schedule> list(@RequestParam("page") int page,
                            @RequestParam("size") int size,
                            @RequestParam(value = "sortBy", defaultValue = "scheduleSeq") String sortBy,
                            @RequestParam(value = "sortDir", defaultValue = "asc") String sortDir,
                            @RequestParam(value = "filter", defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortDir), sortBy));
        Page<Schedule> schedule = repository.findAll(pageable);
        System.out.println("Schedule:"+schedule.getContent());
        return schedule;
    }

    @GetMapping("/{scheduleSeq}")
    public Schedule find(@PathVariable Long scheduleSeq) {
        Schedule schedule = repository.findById(scheduleSeq).orElseThrow();
        return schedule;
    }

    @PostMapping
    public Schedule create(@RequestBody Schedule newOne) {
        System.out.println("Schedule:"+newOne.getTime()+"###:"+newOne.getScheduleSeq()+"@@@:"+newOne.getFee());
        repository.save(newOne);
        return newOne;
    }

    @PutMapping("/{scheduleSeq}")
    public Schedule update(@PathVariable Long scheduleSeq, @RequestBody Schedule newOne) {
        Schedule oldOne = repository.findById(scheduleSeq).orElseThrow();
        oldOne.update(newOne);
        repository.save(oldOne);
        return oldOne;
    }

    @DeleteMapping("/{scheduleSeq}")
    public Schedule delete(@PathVariable Long scheduleSeq) {
        Schedule oldOne = repository.findById(scheduleSeq).orElseThrow();
        repository.delete(oldOne);
        return oldOne;
    }

}
