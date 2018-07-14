package com.example.demo.repository;

import com.example.demo.model.UserToFlightExamination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserToFlightExaminationRepository extends JpaRepository<UserToFlightExamination, Long> {

}
