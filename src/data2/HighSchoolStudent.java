package data2;

import data.Device;
import data.Student;

public class HighSchoolStudent extends Student {

    private boolean isAuthorized;

    public HighSchoolStudent(String name, String nationality, Device device) {
        super(name, nationality, device);
    }

    @Override
    public void putTypeOnScreen() {
        System.out.println("HighSchoolStudent");
    }

    public HighSchoolStudent(String name, String nationality, Device device, boolean isAuthorized) {
        super(name, nationality, device);
        this.isAuthorized = isAuthorized;
    }

}
