package com.codingshuttle.project.uber.strategy;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDTO riderequestdto);
}
