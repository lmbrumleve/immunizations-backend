package com.london.immunizations.service;

import com.london.immunizations.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ChildServiceImpl implements ChildService {
    @Autowired
    private ChildRepository childRepository;
}
