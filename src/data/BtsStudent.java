package data;

public class BtsStudent extends Student {

    private boolean hasInternship;
    private Device device;

    public BtsStudent() {
        super("", "", Device.ANDROID);
//        this.hasInternship = false;
    }

    public BtsStudent(String name, String nationality, Device device) {
        super(name, nationality, device);
//        this.hasInternship = false;
    }

    @Override
    public void putTypeOnScreen() {
        System.out.println("BtsStudent");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public BtsStudent(String name, String nationality, Device device, boolean hasInternship) {
        super(name, nationality, device);
        this.hasInternship = hasInternship;
    }

}
