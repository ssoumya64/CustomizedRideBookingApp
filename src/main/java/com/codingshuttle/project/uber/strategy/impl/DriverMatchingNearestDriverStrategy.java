package com.codingshuttle.project.uber.strategy.impl;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.Entities.Driver;
import com.codingshuttle.project.uber.Entities.RideRequest;
import com.codingshuttle.project.uber.Repositories.DriverRepository;
import com.codingshuttle.project.uber.strategy.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverrepository;
    @Override
    public List<Driver> findMatchingDriver(RideRequest riderequest) {
        return driverrepository.findMatchingDriver(riderequest.getPickupLocation());
    }
}
