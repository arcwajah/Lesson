package Lesson9.Lesson9HomeWork;

public abstract class Car {
    private int year;
    private String manufacturer;
    private CartState cartState;

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public CartState getCartState() {
        return cartState;
    }
}
