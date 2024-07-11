package com.trips.planner.participant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ParticipantRepository extends JpaRepository<ParticipantVO, UUID> {

    List<ParticipantVO> findByTripId(UUID tripId);
}
