package Lesson12;

import Lesson9.Lesson9HomeWork.Car;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.getManufacturer().equals("BMW");
    }
}
