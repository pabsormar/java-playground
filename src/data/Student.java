package data;

public abstract class Student {

    protected String name;
    protected String nationality;
    protected Device device;

    public Student(String name, String nationality, Device device) {
        this.name = name;
        this.nationality = nationality;
        this.device = device;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public final Device getDevice() {
        return device;
    }

    @Override
    public String toString() {
        return "I am " + this.name +
                ", from " + this.nationality + ", and I use " +
                this.device;
    }

    public abstract void putTypeOnScreen();

}