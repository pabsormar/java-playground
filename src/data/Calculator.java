package data;

public class Calculator {

    private int x1;
    private int x2;
    float result;

    public Calculator() {

    }

    public Calculator(int num) {
        this(num, num);   // == Calculator(num, num);
    }

    public Calculator(int num1, int num2) {
        x1 = num1;
        x2 = num2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public void assignValueToX1(int value) {
        x1 = value;
    }

    public int add() {
        return x1 + x2;
    }

    public int add(int mult) {
        return mult * add();
    }

//    public int add(int mult) {
//        return mult * (x1 + x2);
//    }

    public int sub() {
        return x1 - x2;
    }

    public int mult() {
        return x1 * x2;
    }

    public int div() {
        return x1/x2;
    }

}