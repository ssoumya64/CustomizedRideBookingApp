package com.codingshuttle.project.uber.Services.impl;

import com.codingshuttle.project.uber.DTO.DriverDTO;
import com.codingshuttle.project.uber.DTO.RideDTO;
import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.DTO.RiderDTO;
import com.codingshuttle.project.uber.Entities.*;
import com.codingshuttle.project.uber.Entities.enums.RideRequestStatus;
import com.codingshuttle.project.uber.Exceptions.ResourceNotFoundException;
import com.codingshuttle.project.uber.Repositories.RideRequestRepo;
import com.codingshuttle.project.uber.Repositories.RiderRepository;
import com.codingshuttle.project.uber.Services.RiderService;
import com.codingshuttle.project.uber.strategy.RideStrategyManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {


    private final ModelMapper modelmapper;
    private final RideStrategyManager ridestrategymanager;
    private final RideRequestRepo rideRequestRepo;
    private final RiderRepository riderRepository;

    @Override
    public RideRequestDTO requestRide(RideRequestDTO riderequestdto) {
        Rider rider = getCurrentRider();
        RideRequest rideRequest = modelmapper.map(riderequestdto, RideRequest.class);
        rideRequest.setRiderequeststatus(RideRequestStatus.PENDING);
        double fare = ridestrategymanager.rideFareCalculationStrategy().calculateFare(rideRequest);
        rideRequest.setFare(fare);
        RideRequest saveRequest = rideRequestRepo.save(rideRequest);
        ridestrategymanager.drivermatchingstrategy(rider.getRatings()).findMatchingDriver(saveRequest);
        return modelmapper.map(saveRequest,RideRequestDTO.class);
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

    @Override
    public Rider createNewRider(User user) {
        Rider rider = Rider.builder().user(user).ratings(0.0).build();
        return riderRepository.save(rider);
    }


    @Override
    public Rider getCurrentRider() {
        return riderRepository.findById(1L).orElseThrow(()->new ResourceNotFoundException(
                "Rider not found with id: "+1
        ));
    }
}
