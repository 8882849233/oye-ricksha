package com.oye.ricksha.assignment.service;

import com.oye.ricksha.assignment.models.Rating;
import com.oye.ricksha.assignment.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Passenger service.
 */
@Service
public class PassengerService {

    /**
     * The Repository.
     */
    @Autowired
    PassengerRepository repository;

    /**
     * Creat rating rating.
     *
     * @param rating the rating
     * @return the rating
     */
    public Rating creatRating(final Rating rating) {
        return repository.save(rating);
    }

    /**
     * Gets all rating.
     *
     * @param name the name
     * @return the all rating
     */
    public List<Integer> getAllRating(final String name) {
        List<Rating> ratingList = repository.findAllRatingByPassengerEmail(name);
        return ratingList.stream()
                .map(Rating::getRating)
                .collect(Collectors.toList());
    }
}
