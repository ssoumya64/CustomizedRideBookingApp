package com.codingshuttle.project.uber.Repositories;

import com.codingshuttle.project.uber.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
