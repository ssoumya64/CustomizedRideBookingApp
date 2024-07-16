package com.codingshuttle.project.uber.Repositories;

import com.codingshuttle.project.uber.Entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride,Long> {
}
