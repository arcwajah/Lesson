package Lesson14;

import Lesson9.Lesson9HomeWork.Car;
import Lesson9.Lesson9HomeWork.CartState;
import Utils.CarUtils;
import org.omg.CORBA.BAD_CONTEXT;

import java.util.List;

import static Lesson9.Lesson9HomeWork.CartState.BAD;

public class Lesson14 {
    public static void main(String[] args) {
        List<Car> cars = CarUtils.generateListOfCar(5);
        System.out.println(cars);

        System.out.println("Bad car: " + cars.stream().filter(car ->
                car.getCartState() == BAD).findFirst().get());
    }
}
