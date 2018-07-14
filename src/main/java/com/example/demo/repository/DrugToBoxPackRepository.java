package com.example.demo.repository;


import com.example.demo.model.DrugToBoxPack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugToBoxPackRepository extends JpaRepository<DrugToBoxPack, Long> {
}
