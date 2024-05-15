package com.london.immunizations.repository;

import com.london.immunizations.model.Immunization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImmunizationRepository extends JpaRepository<Immunization, Long> {
}
