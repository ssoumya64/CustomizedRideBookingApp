package com.codingshuttle.project.uber.Repositories;

import com.codingshuttle.project.uber.Entities.Driver;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {
    @Query("SELECT d.* FROM DRIVER as d WHERE avilable=true AND")
    List<Driver> findMatchingDriver(Point pickupLocation);
}
