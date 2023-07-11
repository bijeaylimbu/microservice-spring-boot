package com.location.controller;


import com.location.entity.Location;
import com.location.service.locationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private locationService service;


    @GetMapping("/user/{userId}")
    public List<Location> getLocations(@PathVariable("userId") Long userId){
        return this.service.getLocationOfUser(userId);
    }
}
