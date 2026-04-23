package Important;

class Person{
    private int id;
    private String firstName;
    private String lastName;
    private String cnp;


    public Person(){

    }
    public Person(int id, String firstName, String lastName, String cnp) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
    }

    //getter
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Important.Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}


public class DemoEncapsulation {
    public static void main(String[] args){
        Person person1 = new Person(1, "Matei", "Lefter", "5021206330233");
        //getters
        System.out.println(person1.getId());
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getCnp());

        Person person2 = new Person();
        //setters
        person2.setId(2);
        person2.setFirstName("Lele");
        person2.setLastName("Lautaru");
        person2.setCnp("6666666666666");

        System.out.println(person2.getId());
        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getCnp());

        //toString
        System.out.println(person1);
        System.out.println(person2);
        Person person3 = new Person();
        System.out.println(person3);
    }
}
