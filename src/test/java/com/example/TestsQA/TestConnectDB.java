package com.example.TestsQA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest()
public class TestConnectDB {

    @Autowired
    private SensorsTableRepository sensorsTableRepository;

    @Test
    public void givenSensorsTableRepository_whenSaveAndRetreiveEntity_thenOK() {
        SensorsTableEntity sensorsTableEntity1 = new SensorsTableEntity();
        sensorsTableEntity1.setId(13);
        sensorsTableEntity1.setValue(13.2);
        sensorsTableEntity1.setName("typing");
        sensorsTableRepository.save(sensorsTableEntity1);
        Optional<SensorsTableEntity> foundEntity = sensorsTableRepository.findById(sensorsTableEntity1.getId());
        SensorsTableEntity sensorsTableEntity = foundEntity.get();

        assertNotNull(sensorsTableEntity);
        assertEquals(sensorsTableEntity1.getValue(), sensorsTableEntity.getValue());
    }
}
