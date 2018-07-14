package com.example.demo.repository;

import com.example.demo.model.HealthLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthLevelRepository extends JpaRepository<HealthLevel, Long> {
}
