import data.Calculator;
import data.Person;
import data.World;

public class MainPlayground {

    public static void main(String[] args) {

        Calculator calc1 = new Calculator();

        Calculator initializedCalc = new Calculator(73, 12);

        Calculator sameValueCalc = new Calculator(37);

        System.out.println("Add result: " + calc1.add());
        System.out.println("Add result: " + initializedCalc.add());
        System.out.println("Add result: " + sameValueCalc.add());

//        calc1.x1 = 2;
        calc1.assignValueToX1(2);
        int addResult = calc1.add();
        int multAddResult = calc1.add(3);
        System.out.println("Add result: " + addResult);
        System.out.println("Multiplied add result: " + multAddResult);

        World.method1();

        Person p1 = new Person("Pablo");
        Person p2 = new Person("Pedro");
        Person p3 = new Person("Alessandro");
        Person p4 = new Person("Vanessa");

        System.out.println(p1.getName() + ", " +
                p2.getName() + ", " +
                p3.getName() + ", " +
                p4.getName() + "; " +
                "total count = " + p1.count);


//        int myNumber = 4;
//        boolean isGreater = 4 < 2;
//
//
//        Integer mySecondNumber = 4;
//        int isG = mySecondNumber.compareTo(2);

        System.out.println("Hello world!");

    }

}