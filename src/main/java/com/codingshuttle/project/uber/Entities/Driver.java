package com.codingshuttle.project.uber.Entities;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double ratings;
    private Boolean driveravilable;
    @Column(columnDefinition = "Geometry(point, 4326)")
    private Point currentlocation;
}
