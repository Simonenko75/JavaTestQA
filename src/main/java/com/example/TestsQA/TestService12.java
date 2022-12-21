//package com.example.TestsQA;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class TestService12 {
//
////_______________________________________DB_GRUD_______________________________________________
//    @Autowired
//    private SensorsTableRepository sensorsTableRepository;
//
//    public void save(SensorsTableEntity sensorsTableEntity) {
//        sensorsTableRepository.save(sensorsTableEntity);
//    }
//
//    public List<SensorsTableEntity> findAll() {
//        return sensorsTableRepository.findAll();
//    }
//
//    public List<SensorsTableEntity> findAllByName(String name) {
//        return sensorsTableRepository.findAllByName(name);
//    }
//
//    public void update(Long id, Double value, String name) {
//        Optional<SensorsTableEntity> optionalSomeTableEntity = sensorsTableRepository.findById(id);
//        SensorsTableEntity sensorsTableEntity = optionalSomeTableEntity.get();
//        sensorsTableEntity.setValue(value);
//        sensorsTableEntity.setName(name);
//        sensorsTableRepository.save(sensorsTableEntity);
//    }
//
//    public void delete(Long id) {
//        Optional<SensorsTableEntity> optionalSomeTableEntity = sensorsTableRepository.findById(id);
//        SensorsTableEntity sensorsTableEntity = optionalSomeTableEntity.get();
//        sensorsTableRepository.delete(sensorsTableEntity);
//    }
////_____________________________________________________________________________________________
//
//    private Logger log = LoggerFactory.getLogger(TestService12.class);
//
//    public String getData(){
//        log.info("some test data {} {}", 1, 2);
//        return "Hello, World!!!";
//    }
//
//    public String getDataWithParams(String firstVal, String secondVal){
//        log.info("First val {}, second val {}", firstVal, secondVal);
//        return firstVal + secondVal;
//    }
//
//    public TestDTO getTestDTO() {
//        TestDTO testDTO = new TestDTO();
//        testDTO.setNumber(123);
//        testDTO.setStr("ABC");
//        testDTO.setStrings(Arrays.asList(new String[]{"sdf", "sldj", "slkfj"}));
//
//        TestDTO newTestDTO = new TestDTO();
//        newTestDTO.setNumber(45);
//        newTestDTO.setStr("lsdkfj");
//
//        testDTO.setTestDTO(newTestDTO);
//        testDTO.setTestDTOList(Arrays.asList(new TestDTO[] { newTestDTO, newTestDTO, newTestDTO}));
//
//        return testDTO;
//    }
//
//    public TestDTO takeJson(TestDTO testDTO) {
//        log.info("Test DTO result {}", testDTO);
//        return testDTO;
//    }
//
//}
