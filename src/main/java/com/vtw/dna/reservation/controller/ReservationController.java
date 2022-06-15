package com.vtw.dna.reservation.controller;

import com.vtw.dna.reservation.Reservation;
import com.vtw.dna.reservation.repository.ReservationRepository;
import com.vtw.dna.schedule.Schedule;
import com.vtw.dna.schedule.repository.ScheduleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationRepository repository;
    private final ScheduleRepository scheduleRepository;


    @GetMapping
    public Page<Reservation> list(@RequestParam("page") int page,
                                  @RequestParam("size") int size,
                                  @RequestParam(value = "sortBy", defaultValue = "reservationSeq") String sortBy,
                                  @RequestParam(value = "sortDir", defaultValue = "asc") String sortDir,
                                  @RequestParam(value = "filter", defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortDir), sortBy));
        Page<Reservation> reservation = repository.findAllByNameContains(pageable, filter);
        return reservation;
    }
    @GetMapping("/seqList")
    public List<Reservation> listSeqAndName() {
        List<Reservation> reservations = repository.findAll();
        return reservations;
    }

    @GetMapping("/{reservationSeq}")
    public Reservation find(@PathVariable long reservationSeq) {
        Reservation reservation = repository.findById(reservationSeq).orElseThrow();
        return reservation;
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation newOne) {
        Schedule schedule = scheduleRepository.findById(newOne.getScheduleSeq()).orElseThrow();
        schedule.updateSeats(schedule,newOne.getSeat());
        scheduleRepository.save(schedule);

        repository.save(newOne);

        return newOne;
    }

    @PutMapping("/{reservationSeq}")
    public Reservation update(@PathVariable long reservationSeq, @RequestBody Reservation newOne) {
        Reservation oldOne = repository.findById(reservationSeq).orElseThrow();
        oldOne.update(newOne);
        repository.save(oldOne);
        return oldOne;
    }

    @DeleteMapping("/{reservationSeq}")
    public Reservation delete(@PathVariable long reservationSeq) {
        Reservation oldOne = repository.findById(reservationSeq).orElseThrow();
        repository.delete(oldOne);
        return oldOne;
    }

}

