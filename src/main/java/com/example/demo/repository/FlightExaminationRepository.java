package com.example.demo.repository;

import com.example.demo.model.FlightExamination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightExaminationRepository extends JpaRepository<FlightExamination, Long> {
}
