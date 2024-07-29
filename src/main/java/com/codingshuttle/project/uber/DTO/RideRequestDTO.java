package com.codingshuttle.project.uber.DTO;

import com.codingshuttle.project.uber.Entities.Rider;
import com.codingshuttle.project.uber.Entities.enums.PaymentMethod;
import com.codingshuttle.project.uber.Entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDTO {

    private Long id;

    private PointDTO pickupLocation;

    private PointDTO dropofflocation;

    private LocalDateTime requestedtime;

    private RiderDTO rider;

    private PaymentMethod paymentmethod;

    private RideRequestStatus riderequeststatus;
}
