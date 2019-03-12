package data;

public class Person {

    private String name;

    public int count = 0;

    public Person(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

//    public static int getCount() {
//        return count;
//    }

}