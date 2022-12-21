package com.example.TestsQA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

//_________________________________________DB_GRUD__________________________________________________________
    @PostMapping("/save")
    public @ResponseBody void save(@RequestBody SensorsTableEntity sensorsTableEntity) {
        testService.save(sensorsTableEntity);
    }

    @GetMapping("/get/entities")
    public @ResponseBody List<SensorsTableEntity> getEntity() {
        return testService.findAll();
    }

    @GetMapping("/get/entities/by/name")
    public @ResponseBody List<SensorsTableEntity> getEntitiesByName(@RequestParam String name) {
        return testService.findAllByName(name);
    }

    @PutMapping("/update/by/id/{id}")
    public @ResponseBody void updateById(@PathVariable Long id, @RequestParam Double value, @RequestParam String name) {
        testService.update(id, value, name);
    }

    @DeleteMapping("/delete/by/id/{id}")
    public @ResponseBody void deleteById(@PathVariable Long id) {
        testService.delete(id);
    }
//__________________________________________________________________________________________________________

    //__________________________________UpdateAndDeleteAuto________________________________________
    @PostMapping("/save/auto/{id}")
    public @ResponseBody void saveAuto(@PathVariable Long id) {
        testService.saveAuto(id);
    }

    @PutMapping("/update/auto/by/id/{id}")
    public @ResponseBody void updateAutoById(@PathVariable Long id) {
        testService.updateAuto(id);
    }
    //_____________________________________________________________________________________________
}
