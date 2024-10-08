package com.codingshuttle.project.uber.strategy.impl;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.Entities.RideRequest;
import com.codingshuttle.project.uber.Services.DistanceService;
import com.codingshuttle.project.uber.strategy.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class RideFareSurgePricingCalculationStrategy implements RideFareCalculationStrategy {
   private final DistanceService distanceservice;
   private static final double SURGE_FACTOR=2;

    @Override
    public double calculateFare(RideRequest riderequest) {
        double distance = distanceservice.calculateDistance(riderequest.getPickupLocation(),
                riderequest.getDropofflocation());
        return distance*RIDE_FARE_MULTIPLIER*SURGE_FACTOR;
    }
}
