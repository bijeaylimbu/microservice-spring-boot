package com.location.entity;

public class Location {
    private Long locationId;
    private String locationName;
    private String name;
    private Long userId;

    public Location(Long locationId, String locationName, String name, Long userId) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.name = name;
        this.userId = userId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
