package com.oye.ricksha.assignment.controller;

import com.oye.ricksha.assignment.models.Rating;
import com.oye.ricksha.assignment.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Driver controller.
 */
@RestController
@RequestMapping("/driver")
public class DriverController {


    @Autowired
    private DriverService driverService;

    /**
     * Add rating rating.
     *
     * @param rating the rating
     * @return the rating
     */
    @PostMapping("/rating/create")
    public Rating addRating(@RequestBody Rating rating) {
        return driverService.createRating(rating);
    }

    /**
     * Gets all rating.
     *
     * @param driverName the driver name
     * @return the all rating
     */
    @GetMapping("/rating/{driverName}")
    public List<Integer> getAllRating(@PathVariable String driverName) {
        return driverService.getAllRatings(driverName);
    }

}
