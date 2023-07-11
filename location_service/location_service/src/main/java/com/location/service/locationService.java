package com.location.service;

import com.location.entity.Location;

import java.util.List;

public interface locationService {
    public List<Location> getLocationOfUser(Long userId);
}
