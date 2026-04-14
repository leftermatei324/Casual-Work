class Laptop{
    public String brand;

    public Laptop(){

    }
    public Laptop(String brand){
        this.brand = brand;
    }
}

class LaptopStatic{
    public static String brand;
}

public class DemoStatic {
    public static void main(String[] args){
        Laptop asus = new Laptop("Asus");
        Laptop mac = new Laptop("Mac");
        Laptop dell = new Laptop("Dell");
        Laptop anonim = new Laptop();

        System.out.println(asus.brand);
        System.out.println(mac.brand);
        System.out.println(dell.brand);
        System.out.println(anonim.brand);

        asus.brand = "Asus-modificat";
        mac.brand = "Mac-modificat";
        dell.brand = "Dell-modificat";
        anonim.brand = "Anonim-modificat";

        System.out.println(asus.brand);
        System.out.println(mac.brand);
        System.out.println(dell.brand);
        System.out.println(anonim.brand);

        System.out.println();

        LaptopStatic asusStatic = new LaptopStatic();
        LaptopStatic macStatic = new LaptopStatic();
        LaptopStatic dellStatic = new LaptopStatic();
        LaptopStatic anonimStatic = new LaptopStatic();

        System.out.println(asusStatic.brand);
        System.out.println(macStatic.brand);
        System.out.println(dellStatic.brand);
        System.out.println(anonimStatic.brand);

        asusStatic.brand = "New Asus TUF";
        macStatic.brand = "New Mac OS";
        dellStatic.brand = "New dell ";
        anonimStatic.brand = "New anonim";

        System.out.println(asusStatic.brand);
        System.out.println(macStatic.brand);
        System.out.println(dellStatic.brand);
        System.out.println(anonimStatic.brand);
    }
}
