package com.example.TestsQA;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Appendable.class)
public class TestConnectDB {

    @Autowired
    private SensorsTableRepository sensorsTableRepository;

//    @Test
//    public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK() {
//        SensorsTableEntity sensorsTableEntity = sensorsTableRepository.save(new SensorsTableEntity());
//        SensorsTableEntity foundEntity = sensorsTableRepository.findOne(sensorsTableEntity.getId());
//
//        assertNotNull(foundEntity);
//        assertEquals(sensorsTableEntity.getValue(), foundEntity.getValue());
//    }
}
