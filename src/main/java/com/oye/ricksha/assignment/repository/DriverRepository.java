package com.oye.ricksha.assignment.repository;

import com.oye.ricksha.assignment.models.Rating;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * The interface Driver repository.
 */
public interface DriverRepository extends CrudRepository<Rating, String> {

    /**
     * Find all rating by driver email list.
     *
     * @param rating the rating
     * @return the list
     */
    List<Rating> findAllRatingByDriverEmail(String rating);
}