package com.london.immunizations.controller;

import com.london.immunizations.model.Child;
import com.london.immunizations.model.User;
import com.london.immunizations.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChildController {

    @Autowired
    private ChildRepository childRepository;

    @PostMapping("/add/child")
    Child newChild (@RequestBody Child newChild) {
        return childRepository.save(newChild);
    }

    @GetMapping("/children")
    List<Child> getAllChildren() {
        return childRepository.findAll();
    }
}
