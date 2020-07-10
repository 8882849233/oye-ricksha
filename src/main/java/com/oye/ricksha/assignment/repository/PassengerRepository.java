package com.oye.ricksha.assignment.repository;

import com.oye.ricksha.assignment.models.Rating;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * The interface Passenger repository.
 */
public interface PassengerRepository extends CrudRepository<Rating, String> {

    /**
     * Find all rating by passenger name list.
     *
     * @param name the name
     * @return the list
     */
    List<Rating> findAllRatingByPassengerEmail(String name);

}