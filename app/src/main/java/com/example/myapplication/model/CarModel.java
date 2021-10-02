package com.example.myapplication.model;
import java.util.ArrayList;
import java.util.Locale;

public class CarModel {
    private ArrayList<Car> carTypes = new ArrayList<>();

    public CarModel(){
        carTypes.add(new Car( "Suv ", " Santa Fe",2015 ));
        carTypes.add(new Car( "Sedan ", " Accent",2018 ));
        carTypes.add(new Car( "hatch_bag ", " Golf",2020));
    }

    public Car getCarByType(String type) {
        Car car = null;
        for (Car c : carTypes) {
            if (c.getType().toLowerCase(Locale.ROOT).equals(type.toLowerCase())) {
                return c;
            }
        }
        return car;
    }
}
