package com.codingshuttle.project.uber.strategy;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.Entities.Driver;
import com.codingshuttle.project.uber.Entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {
     List<Driver> findMatchingDriver(RideRequest riderequest);
}
