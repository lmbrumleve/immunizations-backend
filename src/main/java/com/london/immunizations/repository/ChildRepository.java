package com.london.immunizations.repository;

import com.london.immunizations.model.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository <Child, Long> {

}
