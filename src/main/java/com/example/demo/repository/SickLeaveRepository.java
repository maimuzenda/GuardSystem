package com.example.demo.repository;

import com.example.demo.model.SickLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SickLeaveRepository extends JpaRepository<SickLeave, Long> {
}
