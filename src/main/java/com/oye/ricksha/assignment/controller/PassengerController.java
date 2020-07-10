package com.oye.ricksha.assignment.controller;

import com.oye.ricksha.assignment.models.Rating;
import com.oye.ricksha.assignment.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Passenger controller.
 */
@RestController
@RequestMapping("/passenger")
public class PassengerController {

    /**
     * The Passenger service.
     */
    @Autowired
    PassengerService passengerService;

    /**
     * Add rating rating.
     *
     * @param rating the rating
     * @return the rating
     */
    @PostMapping("/rating/create")
    public Rating addRating(@RequestBody final Rating rating) {
        return passengerService.creatRating(rating);
    }

    /**
     * Gets all ride.
     *
     * @param passengerName the passenger name
     * @return the all ride
     */
    @GetMapping("/rating/{passengerName}")
    public List<Integer> getAllRide(@PathVariable final String passengerName) {
        return passengerService.getAllRating(passengerName);
    }

}
