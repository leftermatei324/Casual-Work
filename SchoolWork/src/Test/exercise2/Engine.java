package Test.exercise2;

public class Engine {
    int power;
    String type;

    public Engine(int power, String type){
        this.power = power;
        this.type = type;
    }

    public void printInfo(){
        System.out.println("Car HAS-A Engine");
    }
}
