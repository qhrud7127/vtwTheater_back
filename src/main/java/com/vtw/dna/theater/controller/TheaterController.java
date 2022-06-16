package com.vtw.dna.theater.controller;

import com.vtw.dna.theater.Theater;
import com.vtw.dna.theater.repository.TheaterRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/theater")
public class TheaterController {

    private final TheaterRepository repository;

    @GetMapping
    public Page<Theater> list(@RequestParam("page") int page,
                            @RequestParam("size") int size,
                            @RequestParam(value = "sortBy", defaultValue = "theaterId") String sortBy,
                            @RequestParam(value = "sortDir", defaultValue = "asc") String sortDir,
                            @RequestParam(value = "filter", defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortDir), sortBy));
        Page<Theater> theater = repository.findAllByTheaterNmContains(pageable, filter);
        return theater;
    }

    @GetMapping("/seqList")
    public List<Theater> listSeqAndName() {
        List<Theater> theater = repository.findAll();
        return theater;
    }

    @GetMapping("/{theaterId}")
    public Theater find(@PathVariable Long theaterId) {
        Theater movie = repository.findById(theaterId).orElseThrow();
        return movie;
    }

    @PostMapping
    public Theater create(@RequestBody Theater newOne) {
        repository.save(newOne);
        return newOne;
    }

    @PutMapping("/{theaterId}")
    public Theater update(@PathVariable Long theaterId, @RequestBody Theater newOne) {
        Theater oldOne = repository.findById(theaterId).orElseThrow();
        oldOne.update(newOne);
        repository.save(oldOne);
        return oldOne;
    }

    @DeleteMapping("/{theaterId}")
    public Theater update(@PathVariable Long theaterId) {
        Theater oldOne = repository.findById(theaterId).orElseThrow();
        repository.delete(oldOne);
        return oldOne;
    }

}
