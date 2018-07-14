package com.example.demo.repository;

import com.example.demo.model.BoxPack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxPackRepository  extends JpaRepository<BoxPack, Long> {
}
