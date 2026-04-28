package Important;

import java.time.Instant;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String ("abc");
        String s4 = new String ("abc");
        String s5 = new String ("abcdef");

        //comparare 2 literali care merg catre String pool
        //in cazul literal atunci compara direct cele 2 valori
        System.out.println(s1 == s2);

        //compararea a 2 obiecte String care au aceeasi referinta
        System.out.println(s3 == s4);

        String reference3 = s3.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(s3));
        String reference4 = s4.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(s4));
        System.out.println("s3: " + reference3);
        System.out.println("s4: " + reference4);

        //comparare a 2 obiecte vom folosi metoda equals()
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);
        System.out.println(s4.equals(s5));
        System.out.println(s4 == s5);


        String nullValue = null;
        //unsafe
        //nullValue.equals(s1);

        //safe declaration
        s1.equals(nullValue);

    }
}
