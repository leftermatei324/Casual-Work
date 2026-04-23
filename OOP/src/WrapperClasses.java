public class WrapperClasses {
    public static void main(String[] args) {
        //convertim primitve in wrapper objects
        int a = 10;
        double b = 5.5;

        //boxing
        Integer objA = Integer.valueOf(a);
        Double objB = Double.valueOf(b);

        System.out.println(objA);
        System.out.println(objB);

        //autoboxing
        Integer autoA = a;
        Double autoB = b;

        System.out.println(autoA);
        System.out.println(autoB);

        String num = "200";
        //convert to primitive
        int value = Integer.parseInt(num);

        System.out.println(num);
        System.out.println(value);

        //conversie catre obiect
        Integer intObj = Integer.valueOf(value);

        System.out.println(intObj);
    }
}
