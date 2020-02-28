package Lesson7;

import Lesson7.SquareX;
import Lesson7.CircleX;
import Lesson7.TriangleX;

public class Lesson7 {
    public static void main(String[] args) {
        SquareX squareX = new SquareX();
        squareX.calculatePerimetr();
        TriangleX triangleX = new TriangleX();
        triangleX.calculatePerimetr();
        CircleX circleX = new CircleX();
        circleX.calculatePerimetr();

        Object [] basket = {squareX, circleX, triangleX};
        int maxPerim = 0;

        for (int i = 0; i < basket.length; i++) {
            Object shape = basket[i];
            if(shape instanceof  SquareX) {
                SquareX square = (SquareX) shape;
                int currentPerim = squareX.calculatePerimetr();
                if(currentPerim > maxPerim) {
                    maxPerim = currentPerim;
                }
            }
            if(shape instanceof  CircleX) {
                CircleX circle = (CircleX) shape;
                int currentPerim = circleX.calculatePerimetr();
                if(currentPerim > maxPerim) {
                    maxPerim = currentPerim;
                }
            }
            if(shape instanceof  TriangleX) {
                TriangleX triangle = (TriangleX) shape;
                int currentPerim = triangleX.calculatePerimetr();
                if(currentPerim > maxPerim) {
                    maxPerim = currentPerim;
                }
            }
        }
    }

}