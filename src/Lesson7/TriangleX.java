package Lesson7;

import java.util.Scanner;

public class TriangleX {
    private int side;

    public TriangleX() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please, input side size for TRIANGLE: ...");
        int sideFromConsole = scanner.nextInt();

        side = sideFromConsole;
    }
    public int calculatePerimetr() {
        int result = 3* side;
        System.out.println("Perimetr for Triangle: " + result);
        return 3 * this.side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
