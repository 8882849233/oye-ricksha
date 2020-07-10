package com.oye.ricksha.assignment.service;

import com.oye.ricksha.assignment.models.Rating;
import com.oye.ricksha.assignment.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Driver service.
 */
@Service
public class DriverService {

    @Autowired
    private DriverRepository repository;

    /**
     * Gets all ratings.
     *
     * @param name the name
     * @return the all ratings
     */
    public List<Integer> getAllRatings(final String name) {
        List<Rating> ratingList = repository.findAllRatingByDriverEmail(name);
        return ratingList.stream()
                .map(Rating::getRating)
                .collect(Collectors.toList());
    }

    /**
     * Create rating rating.
     *
     * @param rating the rating
     * @return the rating
     */
    public Rating createRating(final Rating rating) {
        return repository.save(rating);
    }


}
