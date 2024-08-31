package com.codingshuttle.project.uber.Services;

import com.codingshuttle.project.uber.DTO.DriverDTO;
import com.codingshuttle.project.uber.DTO.RideDTO;
import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.DTO.RiderDTO;
import com.codingshuttle.project.uber.Entities.Ride;
import com.codingshuttle.project.uber.Entities.Rider;
import com.codingshuttle.project.uber.Entities.User;

import java.util.List;

public interface RiderService {
    RideRequestDTO requestRide(RideRequestDTO riderequestdto);
    RideDTO cancelRide(Long rideId);

    DriverDTO rateDriver(Long rideId, Integer rating);
    RiderDTO getMyProfile();
    List<RideDTO> getAllMyRides();
    Rider createNewRider(User user);
    Rider getCurrentRider();
}
