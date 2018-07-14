package com.example.demo.repository;

import com.example.demo.model.ExaminationRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExaminationRecordRepository  extends JpaRepository<ExaminationRecord, Long> {
}
