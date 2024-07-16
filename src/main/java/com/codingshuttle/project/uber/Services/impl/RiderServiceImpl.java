package com.codingshuttle.project.uber.Services.impl;

import com.codingshuttle.project.uber.DTO.DriverDTO;
import com.codingshuttle.project.uber.DTO.RideDTO;
import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.DTO.RiderDTO;
import com.codingshuttle.project.uber.Entities.Driver;
import com.codingshuttle.project.uber.Entities.Ride;
import com.codingshuttle.project.uber.Entities.enums.RideStatus;
import com.codingshuttle.project.uber.Services.RideService;
import com.codingshuttle.project.uber.Services.RiderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RiderServiceImpl implements RiderService {

    @Override
    public RideRequestDTO requestRide(RideRequestDTO riderequestdto) {
        return null;
    }

    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return null;
    }
}
