package com.vtw.dna.reservation.repository;

import com.vtw.dna.reservation.Reservation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long>{


    Page<Reservation> findAllByNameContains(Pageable pageable, String searchName);


}
