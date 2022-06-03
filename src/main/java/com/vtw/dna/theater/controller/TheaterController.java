package com.vtw.dna.theater.controller;

import com.vtw.dna.reservation.Reservation;
import com.vtw.dna.theater.Theater;
import com.vtw.dna.theater.repository.TheaterRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/theater")
public class TheaterController {

    private final TheaterRepository repository;

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
    public Theater find(@PathVariable String theaterId) {
        Theater movie = repository.findById(theaterId).orElseThrow();
        return movie;
    }

    @PostMapping
    public Theater create(@RequestBody Theater newOne) {
       /* repository.save(newOne);*/
        System.out.println(newOne.toString());
        return newOne;
    }

    @PutMapping("/{userId}")
    public Theater update(@PathVariable String theaterId, @RequestBody Theater newOne) {
        Theater oldOne = repository.findById(theaterId).orElseThrow();
        oldOne.update(newOne);
        repository.save(oldOne);
        return oldOne;
    }

    @DeleteMapping("/{userId}")
    public Theater update(@PathVariable String theaterId) {
        Theater oldOne = repository.findById(theaterId).orElseThrow();
        repository.delete(oldOne);
        return oldOne;
    }

}
