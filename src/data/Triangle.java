package data;

public class Triangle implements IGeometrics {

    private int b = 2;
    private int h = 3;

    @Override
    public int getArea() {
        return b * h / 2;
    }

}