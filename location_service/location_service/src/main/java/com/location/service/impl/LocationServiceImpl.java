package com.location.service.impl;

import com.location.entity.Location;
import com.location.service.locationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationServiceImpl implements locationService {
    @Override
    public List<Location> getLocationOfUser(Long userId) {
        List<Location> list=List.of(new Location(135L, "New York", "USA", 11L),
                new Location(137L, "Kathmandu", "Nepal", 11L)
                );
        return list.stream().filter(location -> location.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
