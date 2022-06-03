package com.vtw.dna.admin.controller;

import com.vtw.dna.admin.Admin;
import com.vtw.dna.admin.repository.AdminRepository;
import com.vtw.dna.customer.Customer;
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
@RequestMapping("/admin")
public class AdminController {

    private final AdminRepository repository;
    @GetMapping("/{userId}")
    public Admin find(@PathVariable String userId) {
        Admin admin = repository.findById(userId).orElseThrow();
        return admin;
    }

    @PostMapping
    public Admin create(@RequestBody Admin newOne) {
       /* repository.save(newOne);*/
        System.out.println(newOne.toString());
        return newOne;
    }

    @PutMapping("/{userId}")
    public Admin update(@PathVariable String userId, @RequestBody Admin newOne) {
        Admin oldOne = repository.findById(userId).orElseThrow();
        oldOne.update(newOne);
        repository.save(oldOne);
        return oldOne;
    }

    @DeleteMapping("/{userId}")
    public Admin update(@PathVariable String userId) {
        Admin oldOne = repository.findById(userId).orElseThrow();
        repository.delete(oldOne);
        return oldOne;
    }

}
