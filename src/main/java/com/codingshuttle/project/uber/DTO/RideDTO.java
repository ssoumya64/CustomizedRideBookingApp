package com.codingshuttle.project.uber.DTO;

import com.codingshuttle.project.uber.Entities.Rider;
import com.codingshuttle.project.uber.Entities.enums.PaymentMethod;
import com.codingshuttle.project.uber.Entities.enums.RideRequestStatus;
import com.codingshuttle.project.uber.Entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDTO {

    private Long id;

    private Point pickupLocation;

    private Point dropofflocation;

    private LocalDateTime requestedtime;

    private RiderDTO rider;

    private DriverDTO driver;

    private PaymentMethod paymentmethod;

    private Double fare;

    private RideStatus rideStatus;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;
}
