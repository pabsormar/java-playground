package data;

import static java.lang.Math.PI;

public class Circle {

    private int radius = 4;

    public int getArea() {
        return (int) (PI * radius * radius);
    }

}