package com.trips.planner.activity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ActivityRepository extends JpaRepository<ActivityVO, UUID> {
    List<ActivityVO> findByTripId(UUID tripId);
}
