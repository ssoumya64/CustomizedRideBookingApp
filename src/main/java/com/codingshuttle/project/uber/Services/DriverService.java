package com.codingshuttle.project.uber.Services;

import com.codingshuttle.project.uber.DTO.DriverDTO;
import com.codingshuttle.project.uber.DTO.RideDTO;
import com.codingshuttle.project.uber.DTO.RiderDTO;

import java.util.List;

public interface DriverService {

    RiderDTO acceptRide(Long rideId);
    RideDTO cancelRide(Long rideId);
    RideDTO startRide(Long rideId);
    RideDTO endRide(Long rideId);
    RiderDTO rateRider(Long rideId, Integer rating);
    DriverDTO getMyProfile();
    List<RideDTO> getAllMyRides();
}
