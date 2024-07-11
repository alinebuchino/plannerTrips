package com.trips.planner.link;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LinkRepository extends JpaRepository<LinkVO, UUID> {
    public List<LinkVO> findByTripId(UUID tripId);
}
