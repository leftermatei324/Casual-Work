package Important;

class Student{
    String nume;
    int nota;

    public Student(){

    }

    public Student(String nume, int nota) {
        this.nume = nume;
        this.nota = nota;
    }

    public void printTest(){
        System.out.println("test print din clasa student");
    }

    @Override
    public String toString() {
        return "Important.Student{" +
                "nume='" + nume + '\'' +
                ", nota=" + nota +
                '}';
    }
}

class StudentJava extends Student{

}


//clasa parinte
class Forma {
    protected int latura;
    protected String nume;

    public Forma(int latura, String nume) {
        System.out.println("Constr parinte");
        this.latura = latura;
        this.nume = nume;
    }

    public void printForm(){
        System.out.println("suntem la dracu in praznic din clasa parinte");
        System.out.println("latura = " + latura + "nume = " + nume);
    }
}

//subclasa
class Patrat extends Forma{
    protected int diametru;
    public Patrat(int latura, String nume, int diametru){
        super(latura,nume);
        System.out.println("Suntem in constr parinte patrat");
        this.diametru = diametru;
    }
    public void printDiametru(){
        System.out.println("suntem la dracu in praznic din sublcasa");
        System.out.println("diametr " + diametru);
    }

    @Override
    public String toString() {
        return "Important.Patrat " +
                "diametru=" + diametru +
                ", latura=" + latura +
                ", nume='" + nume + '\'';
    }
}
public class DemoEnharitance {
    public static void main(String[] args) {
        Patrat patrat = new Patrat(10, "Primul patrat", 19);
        System.out.println(patrat);
        patrat.printForm();
        patrat.printDiametru();

        StudentJava studentJava = new StudentJava();
        studentJava.nume = "Matei";
        studentJava.nota = 2;
        System.out.println(studentJava);
        studentJava.printTest();

        if(studentJava instanceof Student){
            System.out.println("true student");
        }else {
            System.out.println("false, nu e student borat");
        }
    }
}
