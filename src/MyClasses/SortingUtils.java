package MyClasses;

import MyClasses.Person;

public class SortingUtils {

    public static void sortAndPrintArrayOfInt(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    int current = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = current;
                }
            }
        }
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
    }

    public static void sortAndPrintArrayOfPerson(Person[] team) {
        //TODO implement MyClasses.Person sorting by age
    }

    public static void sortAndPrintArrayOfCar(Person.Car[] autoPark) {
        //TODO implement MyClasses.Person.Car sorting by price
    }
}
