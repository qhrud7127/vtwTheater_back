package com.vtw.dna.devExtreme.repository;

import com.vtw.dna.devExtreme.DevExtreme;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevExtremeRepository extends JpaRepository<DevExtreme, Long> {
    Page<DevExtreme> findAllByTitleContains(Pageable pageable, String searchName);
}
