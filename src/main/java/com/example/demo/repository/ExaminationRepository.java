package com.example.demo.repository;

import com.example.demo.model.Examination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ExaminationRepository extends JpaRepository<Examination, Long> {

    List<Examination> findExaminationsByIdIn(Long[] ids);
}
