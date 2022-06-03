package com.vtw.dna.theater.repository;

import com.vtw.dna.reservation.Reservation;
import com.vtw.dna.theater.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater, String>{
/*

    Page<Movie> findAllByNameContains(Pageable pageable, String searchName);
*/

}
