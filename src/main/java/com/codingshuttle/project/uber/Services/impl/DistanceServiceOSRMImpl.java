package com.codingshuttle.project.uber.Services.impl;

import com.codingshuttle.project.uber.Services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dstn) {
        return 0;
    }
}
