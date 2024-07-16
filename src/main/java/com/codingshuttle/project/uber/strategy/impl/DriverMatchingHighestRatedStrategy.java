package com.codingshuttle.project.uber.strategy.impl;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.Entities.Driver;
import com.codingshuttle.project.uber.strategy.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDTO riderequestdto) {
        return null;
    }
}
