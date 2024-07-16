package com.codingshuttle.project.uber.Services;

import com.codingshuttle.project.uber.DTO.RideRequestDTO;
import com.codingshuttle.project.uber.Entities.Driver;
import com.codingshuttle.project.uber.Entities.Ride;
import com.codingshuttle.project.uber.Entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

     Ride getRideById(Long rideId);
     void matchWithDrivers(RideRequestDTO riderequestdto);
     Ride createnewRide(RideRequestDTO rideRequestDTO, Driver driver);
     Ride updateRideStatus(Long rideId, RideStatus ridestatus);
     Page<Ride> getAllRidesofRider(Long riderId, PageRequest pagerequest);

     Page<Ride> getAllRidesOfDriver(Long driverId,PageRequest pageRequest);
}
