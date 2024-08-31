package com.codingshuttle.project.uber.Utils;

import com.codingshuttle.project.uber.DTO.PointDTO;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;

public class GeomentryUtils {
    public static Point createPoint(PointDTO pointDto) {
        if (pointDto == null || pointDto.getCoordinate() == null || pointDto.getCoordinate().length != 2) {
            throw new IllegalArgumentException("Invalid PointDTO or coordinates");
        }

        // Extract coordinates
        double x = pointDto.getCoordinate()[0]; // Typically longitude
        double y = pointDto.getCoordinate()[1]; // Typically latitude

        // Create GeometryFactory with SRID 4326
        GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);

        // Create a Coordinate object with the extracted values
        Coordinate coordinate = new Coordinate(x, y);

        // Create and return the Point object
        return geometryFactory.createPoint(coordinate);
    }
}
