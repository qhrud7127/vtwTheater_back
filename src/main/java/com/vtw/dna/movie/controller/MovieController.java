package com.vtw.dna.movie.controller;

import com.vtw.dna.customer.Customer;
import com.vtw.dna.movie.Movie;
import com.vtw.dna.movie.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/movie")
public class MovieController {

    private final MovieRepository repository;

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
    public Movie find(@PathVariable String movieId) {
        Movie movie = repository.findById(movieId).orElseThrow();
        return movie;
    }

    @PostMapping
    public Movie create(@RequestBody Movie newOne) {
       /* repository.save(newOne);*/
        System.out.println(newOne.toString());
        return newOne;
    }

    @PutMapping("/{userId}")
    public Movie update(@PathVariable String movieId, @RequestBody Movie newOne) {
        Movie oldOne = repository.findById(movieId).orElseThrow();
        oldOne.update(newOne);
        repository.save(oldOne);
        return oldOne;
    }

    @DeleteMapping("/{userId}")
    public Movie update(@PathVariable String movieId) {
        Movie oldOne = repository.findById(movieId).orElseThrow();
        repository.delete(oldOne);
        return oldOne;
    }

}
