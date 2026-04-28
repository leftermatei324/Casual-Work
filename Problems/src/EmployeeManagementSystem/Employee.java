package EmployeeManagementSystem;

public class Employee {
    String name;
    double salary;

    public Employee(){

    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void displayinfo(){
        System.out.println("Employee: " + name );
    }

    public void displayinfo(boolean detailed){
        if(detailed){
            System.out.println("Employee: " + name + ", Salary: " + salary);
        } else {
            displayinfo();
        }
    }

}
