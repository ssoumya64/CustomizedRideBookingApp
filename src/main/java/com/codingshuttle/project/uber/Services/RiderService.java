package com.codingshuttle.project.uber.Services;

import com.codingshuttle.project.uber.DTO.DriverDTO;
import com.codingshuttle.project.uber.DTO.RideDTO;
import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.DTO.RiderDTO;

import java.util.List;

public interface RiderService {
    RideRequestDTO requestRide(RideRequestDTO riderequestdto);
    RideDTO cancelRide(Long rideId);

    DriverDTO rateDriver(Long rideId, Integer rating);
    RiderDTO getMyProfile();
    List<RideDTO> getAllMyRides();
}
