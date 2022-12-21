package com.example.TestsQA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorsTableRepository extends JpaRepository<SensorsTableEntity, Long> {

    List<SensorsTableEntity> findAllByName(String name);

}
