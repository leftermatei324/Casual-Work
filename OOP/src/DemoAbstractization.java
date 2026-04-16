
abstract class FormaAbstracta{
    protected String name;

    abstract double getAriaAbstract();
    abstract int getDiametre();

    //nu prea se foloseste o astfel de metoda aici
    public double getAriaNonAbstract() {
        return 0;
    }
}

class Triunghi extends FormaAbstracta{

    @Override
    double getAriaAbstract() {
        return 44;
    }

    @Override
    int getDiametre() {
        return 0;
    }
}

class Cerc extends FormaAbstracta{

    @Override
    double getAriaAbstract() {
        return Math.PI * 2;
    }

    @Override
    int getDiametre() {
        return 0;
    }
}

public class DemoAbstractization {
    public static void main(String[] args) {
        Triunghi triunghi = new Triunghi();
        System.out.println("Arie triunghi " + triunghi.getAriaAbstract());

        Cerc cerc = new Cerc();
        System.out.println("Arie cerc " + cerc.getAriaAbstract());
    }
}
