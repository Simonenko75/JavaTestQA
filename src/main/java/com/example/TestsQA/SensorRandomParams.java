package com.example.TestsQA;

import org.springframework.stereotype.Service;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class SensorRandomParams {

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public static double create_value()
    {
        int min = 1;
        int max = 1000;

        double a = Math.random()*(max-min+1)+min;

        return roundAvoid(a, 2);
    }

    public static String create_name()
    {
        ArrayList<String> sensor_name = new ArrayList<String>();
        // добавим в список ряд элементов
        sensor_name.add("WEB");
        sensor_name.add("webies");
        sensor_name.add("Weby");
        sensor_name.add("Web");
        sensor_name.add("WebAdmin");
        sensor_name.add("WebTemp");
        sensor_name.add("WebSpeed");

        Random r = new Random();
        int randomItem = r.nextInt(sensor_name.size());

        return sensor_name.get(randomItem);
    }

    public void givenList_whenNumberElementsChosen_shouldReturnRandomElementsRepeat() {
        Random rand = new Random();
        List givenList = Arrays.asList("one", "two", "three", "four");

        int numberOfElements = 2;

        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = rand.nextInt(givenList.size());
            String randomElement = (String) givenList.get(randomIndex);
        }
    }

}
