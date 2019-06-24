package com.javahelps.restservice.controller;

import com.javahelps.restservice.entity.Hotstar;
import com.javahelps.restservice.repository.HotStarRepository;
import com.javahelps.restservice.repository.HotStarRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Prabhat Arya on  Jun,24 2019
 **/

@RestController
@RequestMapping(path = "/hotstar")
public class HotStarController {
    @Autowired
    private HotStarRepository repository;

    @Autowired
    private HotStarRepository2 repository2;


    @GetMapping(path = "/details/{showname}")
    public List<Hotstar> findAll(@PathVariable("showname") String showname) {
        return repository.findBySearchTerm(showname);
    }

    @PostMapping(consumes = "application/json")
    public Hotstar create(@RequestBody Hotstar hotStar) {
        return repository2.save(hotStar);
    }

}
