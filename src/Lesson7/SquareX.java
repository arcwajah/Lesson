package Lesson7;

import java.util.Scanner;

public class SquareX {
    private int side;

    public SquareX() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please, input side size for SQUARE: ....");
        int sideFromConsole = scanner.nextInt();

        side = sideFromConsole;
    }

    public int calculatePerimetr() {
        int result = 4* side;
        System.out.println("Perimetr for Square: " + result);
        return 4 * this.side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
