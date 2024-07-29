package com.codingshuttle.project.uber.Utils;

import com.codingshuttle.project.uber.DTO.PointDTO;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;

public class GeomentryUtils {
    public static Point createPoint(PointDTO pointDto){
        GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
        Coordinate coordinate=new Coordinate(pointDto.getCoordinate()[0]
                ,pointDto.getCoordinate()[1]);
        return  geometryFactory.createPoint(coordinate);
    }
}
