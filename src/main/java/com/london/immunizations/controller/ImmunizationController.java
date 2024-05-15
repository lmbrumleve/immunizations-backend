package com.london.immunizations.controller;

import com.london.immunizations.model.Immunization;
import com.london.immunizations.repository.ImmunizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @CrossOrigin("http://localhost:5173")
    public class ImmunizationController {

        @Autowired
        private ImmunizationRepository immunizationRepository;

        @PostMapping("/add/immunization")
        Immunization newImmunization (@RequestBody Immunization newImmunization) {
            return immunizationRepository.save(newImmunization);
        }

        @GetMapping("/immunizations")
        List<Immunization> getAllImmunizations() {
            return immunizationRepository.findAll();
        }
    }

}
