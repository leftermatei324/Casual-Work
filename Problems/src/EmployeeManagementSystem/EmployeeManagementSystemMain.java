package EmployeeManagementSystem;

public class EmployeeManagementSystemMain {
    public static void main(String[] args) {
        Developer developer = new Developer("Matei", 2000, "Java");
        Manager manager = new Manager("Andrei", 9000, 16);

        developer.displayinfo();
        developer.displayinfo(true);
        developer.work();

        manager.displayinfo();
        manager.displayinfo(true);
        manager.work();
    }
}
