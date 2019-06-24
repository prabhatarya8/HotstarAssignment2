package com.javahelps.restservice.repository;

import com.javahelps.restservice.entity.Hotstar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Prabhat Arya on  Jun,24 2019
 **/
public interface HotStarRepository extends Repository<Hotstar, Long> {

    @Query(value = "SELECT t FROM Hotstar t where t.showname =?1")
    List<Hotstar> findBySearchTerm(@Param("searchTerm") String searchTerm) ;

}
