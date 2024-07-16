package com.codingshuttle.project.uber.Entities;

import com.codingshuttle.project.uber.Entities.enums.PaymentMethod;
import com.codingshuttle.project.uber.Entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "Geometry(point, 4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "Geometry(point, 4326)")
    private Point dropofflocation;
    @CreationTimestamp
    private LocalDateTime requestedtime;
    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentmethod;
    @Enumerated(EnumType.STRING)
    private RideRequestStatus riderequeststatus;

}
