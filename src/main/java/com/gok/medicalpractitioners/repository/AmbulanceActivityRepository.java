package com.gok.medicalpractitioners.repository;

import com.gok.medicalpractitioners.domain.AmbulanceActivity;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the AmbulanceActivity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AmbulanceActivityRepository extends JpaRepository<AmbulanceActivity, Long> {
}
