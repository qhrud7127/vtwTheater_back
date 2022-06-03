package com.vtw.dna.movie.repository;

import com.vtw.dna.customer.Customer;
import com.vtw.dna.movie.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String> {
/*

    Page<Movie> findAllByNameContains(Pageable pageable, String searchName);
*/

}
