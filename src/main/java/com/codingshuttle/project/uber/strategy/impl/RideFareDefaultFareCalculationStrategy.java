package com.codingshuttle.project.uber.strategy.impl;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.Entities.RideRequest;
import com.codingshuttle.project.uber.Services.DistanceService;
import com.codingshuttle.project.uber.strategy.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;
    @Override
    public double calculateFare(RideRequest riderequest) {
        double distance = distanceService.calculateDistance(riderequest.getPickupLocation(), riderequest.getPickupLocation());
        return distance*RIDE_FARE_MULTIPLIER;
    }
}
