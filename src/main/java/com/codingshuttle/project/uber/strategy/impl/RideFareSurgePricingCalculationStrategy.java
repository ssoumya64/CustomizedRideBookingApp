package com.codingshuttle.project.uber.strategy.impl;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.Entities.RideRequest;
import com.codingshuttle.project.uber.strategy.RideFareCalculationStrategy;

public class RideFareSurgePricingCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest riderequest) {
        return 0;
    }
}
