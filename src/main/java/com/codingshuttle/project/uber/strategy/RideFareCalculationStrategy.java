package com.codingshuttle.project.uber.strategy;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.Entities.RideRequest;
import com.codingshuttle.project.uber.Services.DistanceService;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER=10;

    double calculateFare(RideRequest riderequest);
}
