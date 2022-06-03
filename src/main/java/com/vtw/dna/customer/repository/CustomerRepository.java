package com.vtw.dna.customer.repository;

import com.vtw.dna.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    Page<Customer> findAllByNameContains(Pageable pageable, String searchName);

}
