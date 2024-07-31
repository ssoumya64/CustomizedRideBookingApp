package com.codingshuttle.project.uber.Repositories;

import com.codingshuttle.project.uber.Entities.Driver;
import com.codingshuttle.project.uber.Entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider,Long> {
}
