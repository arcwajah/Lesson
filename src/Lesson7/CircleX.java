package Lesson7;

import java.util.Scanner;

public class CircleX {
    private int radius;

    public CircleX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input side size for CIRCLE: ....");
        int radiusFromConsole = scanner.nextInt();

        radius = radiusFromConsole;
    }

    public int calculatePerimetr() {
        int result = (int) (2 * Math.PI * radius);
        System.out.println("Perimetr for Circle: " + result);
        return result;
    }

    public int getSide() {
        return radius;
    }

    public void setSide(int side) {
        this.radius = side;
    }
}
