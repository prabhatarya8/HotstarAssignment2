package com.javahelps.restservice.repository;

import com.javahelps.restservice.entity.Hotstar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by Prabhat Arya on  Jun,24 2019
 **/

@RestResource(exported = false)
public interface HotStarRepository2 extends JpaRepository<Hotstar, String> {
}
