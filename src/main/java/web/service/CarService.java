package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {
    private List<Car> cars = Arrays.asList(
            new Car("Tesla","FV205C"),
            new Car("Jeep","BP195J"),
            new Car("Nissan","PV835Z"),
            new Car("Lada","PZ258B"),
            new Car("Ford","SI400N"));

    public List<Car> getAmountOfCars(Integer count) {
        if (count == null || count >= 5 || count < 1) {
            return cars;
        } else {
            List<Car> carsToReturn = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                carsToReturn.add(cars.get(i));
            }
            return carsToReturn;
        }
    }
}
