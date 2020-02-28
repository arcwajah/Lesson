package Lesson12;

import MyClasses.Person;

import java.util.function.UnaryOperator;

public class MyUnaryOperator implements UnaryOperator<Person> {
    @Override
    public Person apply(Person person) {
        person.salary += 100;
        return person;
    }
}
