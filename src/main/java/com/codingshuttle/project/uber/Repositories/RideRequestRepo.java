package com.codingshuttle.project.uber.Repositories;

import com.codingshuttle.project.uber.Entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepo extends JpaRepository<RideRequest,Long> {
}
