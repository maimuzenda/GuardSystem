package com.example.demo.repository;

import com.example.demo.model.Certificate;
import com.example.demo.model.Examination;
import com.example.demo.model.ExaminationToCertificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExaminationToCertificateRepository extends JpaRepository<ExaminationToCertificate, Long> {
    List<ExaminationToCertificate> findAllByCertificate(Certificate certificate);
}
