package data;

public class Square implements IGeometrics {

    private int side = 5;

    @Override
    public int getArea() {
        return side * side;
    }
}