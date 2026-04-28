package EmployeeManagementSystem;

public class Manager extends Employee implements Workable{
    int teamSize;

    public Manager(String name, int salary, int teamSize){
        super(name,salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayinfo() {
        System.out.println("Manager: " + getName() + " is leading a team of " + teamSize);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + ", with team size of " + teamSize);
    }
}
