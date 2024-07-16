package com.codingshuttle.project.uber.Services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {
    double calculateDistance(Point src,Point dstn);
}
