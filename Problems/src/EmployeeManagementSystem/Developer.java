package EmployeeManagementSystem;

public class Developer extends Employee implements Workable{
    String programmingLanguage;

    public Developer(String name, int salary, String programmingLanguage){
        super(name,salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayinfo() {
        System.out.println("Developer: " + getName() + " expert in language " + programmingLanguage);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding in " + programmingLanguage);
    }
}
