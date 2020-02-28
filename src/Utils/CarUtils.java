package Utils;

import Lesson9.Lesson9HomeWork.Car;
import Lesson9.Lesson9HomeWork.CartState;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CarUtils {
    public static List<Car> generateListOfCar(int amount){
        List<Car> result = new ArrayList<>();
        return new ArrayList<>(amount);
    }

    public static int getRandomYear() {
        return (int)((Math.random() * 25) + 1990);
    }

    public static String getManufacturer() {
        return UUID.randomUUID().toString();
    }

    public CartState getCarState() {
        int randomState = (int) (Math.random() * 2);
        return CartState.values()[randomState];
    }
}
