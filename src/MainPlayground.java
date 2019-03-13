import data.*;
import data2.HighSchoolStudent;

public class MainPlayground {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Student viktor = new BtsStudent("Viktor", "Russia", Device.IPHONE);
        Student vanessa = new BtsStudent();
        Student tim = new HighSchoolStudent("Tim", "UK", Device.IPHONE, true);

        Student[] myStudents = { viktor, vanessa, tim };

//        ITest iTest = new ITest();
        TestClass testClass = new TestClass();
        System.out.println(ITest.PI);

    }

}