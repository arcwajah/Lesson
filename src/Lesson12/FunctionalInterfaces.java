package Lesson12;

import Lesson9.Lesson9HomeWork.Car;
import Lesson9.Lesson9HomeWork.CartState;
import Lesson9.Lesson9HomeWork.Truck;
import MyClasses.Person;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

    static void useSupplier(Supplier<String> stringSupplier) {
        System.out.println(stringSupplier.get());
    }

    static String useFunction(Function<Integer, String> function,
                              Integer integer) {
        return function.apply(integer);
    }

    static void usePredicate(Predicate<Car> carPredicate, Car testCat) {
        boolean isOk = carPredicate.test(testCat);
        System.out.println(isOk ? "Car is Ok" : "Not a good One");
    }

    public static void main(String[] args) {

        //UnaryOperator;
        Person person = new Person(560001);

        MyUnaryOperator ClassUnaryOperator = new MyUnaryOperator();


        //Supplier:
        Supplier<String> classSupplier = new MySupplier();
        Supplier<String> anonymousSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "from Anonymous initialization";
            }
        };
        Supplier<String> lambdaSuppler = () -> "from Lambda supplier";

        useSupplier(classSupplier);
        useSupplier(anonymousSupplier);
        useSupplier(lambdaSuppler);

        int age = 1300;
        useSupplier(() -> "A" + age);

        //Function:
        Function<Integer, String> classFunction = new MyFunction();
        Function<Integer, String> anonymousFunction = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "String from anonymous initialization: " + integer.toString();

            }
        };
        Function<Integer, String> lambdaFunction = (i) -> "From Lambda: " + i.toString();
        System.out.println(useFunction(classFunction, 444));
        System.out.println(useFunction(anonymousFunction, 890));
        System.out.println(useFunction(lambdaFunction, 666));
        System.out.println(useFunction((i) -> i + "from Inline Lambda", 22));

        //Predicate:
        /*Predicate<Car> classPredicate = new MyPredicate();
        Car car1 = new Truck(2050, "BMW", CartState.EXCELLENT);
        Car car2 = new Truck(2050, "Tesla", CartState.EXCELLENT);
        usePredicate(classPredicate, car1);
        usePredicate(classPredicate, car2);*/
    }
    }

