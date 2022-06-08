package com.vtw.dna.theater.repository;

import com.vtw.dna.theater.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TheaterRepository extends JpaRepository<Theater, Long>{


    Page<Theater> findAllByTheaterNmContains(Pageable pageable, String searchName);


}
