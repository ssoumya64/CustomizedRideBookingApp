package com.codingshuttle.project.uber.Services.impl;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.Entities.Driver;
import com.codingshuttle.project.uber.Entities.Ride;
import com.codingshuttle.project.uber.Entities.enums.RideStatus;
import com.codingshuttle.project.uber.Services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDTO riderequestdto) {

    }

    @Override
    public Ride createnewRide(RideRequestDTO rideRequestDTO, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus ridestatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesofRider(Long riderId, PageRequest pagerequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
