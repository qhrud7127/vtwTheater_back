package com.vtw.dna.customer.controller;

import com.vtw.dna.customer.Customer;
import com.vtw.dna.customer.repository.CustomerRepository;
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
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerRepository repository;

    @GetMapping
    public Page<Customer> list(@RequestParam("page") int page,
                               @RequestParam("size") int size,
                               @RequestParam(value = "sortBy", defaultValue = "userId") String sortBy,
                               @RequestParam(value = "sortDir", defaultValue = "asc") String sortDir,
                               @RequestParam(value = "filter", defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortDir), sortBy));
        Page<Customer> customers = repository.findAllByNameContains(pageable, filter);
        return customers;
    }

    @GetMapping("/{userId}")
    public Customer find(@PathVariable String userId) {
        Customer customer = repository.findById(userId).orElseThrow();
        return customer;
    }

    @PostMapping
    public Customer create(@RequestBody Customer newOne) {
       /* repository.save(newOne);*/
        return newOne;
    }


    @PutMapping("/{userId}")
    public Customer update(@PathVariable String userId, @RequestBody Customer newOne) {
        Customer oldOne = repository.findById(userId).orElseThrow();
        oldOne.update(newOne);
        repository.save(oldOne);
        return oldOne;
    }

    @DeleteMapping("/{userId}")
    public Customer update(@PathVariable String userId) {
        Customer oldOne = repository.findById(userId).orElseThrow();
        repository.delete(oldOne);
        return oldOne;
    }

}
