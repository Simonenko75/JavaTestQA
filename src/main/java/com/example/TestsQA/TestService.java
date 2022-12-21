package com.example.TestsQA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TestService {

//_______________________________________DB_GRUD_______________________________________________
    @Autowired
    private SensorsTableRepository sensorsTableRepository;

    public void save(SensorsTableEntity sensorsTableEntity) {
        sensorsTableRepository.save(sensorsTableEntity);
    }

    public List<SensorsTableEntity> findAll() {
        return sensorsTableRepository.findAll();
    }

    public List<SensorsTableEntity> findAllByName(String name) {
        return sensorsTableRepository.findAllByName(name);
    }

    public void update(Long id, Double value, String name) {
        Optional<SensorsTableEntity> optionalSensorsTableEntity = sensorsTableRepository.findById(id);
        SensorsTableEntity sensorsTableEntity = optionalSensorsTableEntity.get();
        sensorsTableEntity.setValue(value);
        sensorsTableEntity.setName(name);
        sensorsTableRepository.save(sensorsTableEntity);
    }

    public void delete(Long id) {
        Optional<SensorsTableEntity> optionalSomeTableEntity = sensorsTableRepository.findById(id);
        SensorsTableEntity sensorsTableEntity = optionalSomeTableEntity.get();
        sensorsTableRepository.delete(sensorsTableEntity);
    }
//_____________________________________________________________________________________________

//__________________________________UpdateAndDeleteAuto________________________________________
    public void saveAuto(long id) {
        SensorsTableEntity sensorsTableEntity = new SensorsTableEntity();
        sensorsTableEntity.setId(id);
        sensorsTableEntity.setValue(SensorRandomParams.create_value());
        sensorsTableEntity.setName(SensorRandomParams.create_name());
        sensorsTableRepository.save(sensorsTableEntity);
    }

    public void updateAuto(long id) {
        Optional<SensorsTableEntity> optionalSensorsTableEntity = sensorsTableRepository.findById(id);
        SensorsTableEntity sensorsTableEntity = optionalSensorsTableEntity.get();
        sensorsTableEntity.setValue(SensorRandomParams.create_value());
        sensorsTableEntity.setName(SensorRandomParams.create_name());
        sensorsTableRepository.save(sensorsTableEntity);
    }
//_____________________________________________________________________________________________

}
