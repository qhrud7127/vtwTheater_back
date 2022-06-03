package com.vtw.dna.reservation.controller;

import com.vtw.dna.movie.Movie;
import com.vtw.dna.reservation.Reservation;
import com.vtw.dna.reservation.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationRepository repository;

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
    public Reservation find(@PathVariable Integer reservationSeq) {
        Reservation reservation = repository.findById(reservationSeq).orElseThrow();
        return reservation;
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation newOne) {
       /* repository.save(newOne);*/
        System.out.println(newOne.toString());
        return newOne;
    }

    @PutMapping("/{userId}")
    public Reservation update(@PathVariable Integer reservationSeq, @RequestBody Reservation newOne) {
        Reservation oldOne = repository.findById(reservationSeq).orElseThrow();
        oldOne.update(newOne);
        repository.save(oldOne);
        return oldOne;
    }

    @DeleteMapping("/{userId}")
    public Reservation update(@PathVariable Integer reservationSeq) {
        Reservation oldOne = repository.findById(reservationSeq).orElseThrow();
        repository.delete(oldOne);
        return oldOne;
    }

}
