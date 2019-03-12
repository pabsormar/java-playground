import data.Circle;
import data.IGeometrics;
import data.Square;
import data.Triangle;

import java.awt.*;

public class MainPlayground {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        Circle c1 = new Circle();
        Square sq1 = new Square();

        System.out.println("t1 area = " + t1.getArea());
        System.out.println("t2 area = " + t2.getArea());
        System.out.println("c1 area = " + c1.getArea());
        System.out.println("sq1 area = " + sq1.getArea());

        int[] arraySample = { 1, 2, 3, 4, 7, 0 };
        IGeometrics[] figures = { sq1, t1, t2 };

        for (int idx = 0; idx < figures.length; idx++) {
            System.out.println("figure area = " + figures[idx].getArea());
        }

        IGeometrics myInterface = new IGeometrics();

    }

}