package com.example.TestsQA;

import javax.persistence.*;

@Entity(name = "sensors")
public class SensorsTableEntity {

    @Id
    @Column(name = "sensor_id")
    private long id;

    @Column(name = "sensor_value")
    private Double value;

    @Column(name = "sensor_name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = SensorRandomParams.roundAvoid(value, 2);;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
