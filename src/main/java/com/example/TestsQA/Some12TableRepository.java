package com.example.TestsQA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Some12TableRepository extends JpaRepository<SensorsTableEntity, Long> {

    List<SensorsTableEntity> findAllByName(String name);

}
