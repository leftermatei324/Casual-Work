package Important;

public class NullValueDemo {
    public static void main(String[] args) {
        Integer value = null;

        //int x = value; -> nu este recomandat
        //add safety check

        if(value != null){
            int x = value;
        }else {
            System.out.println("Value is null");
        }
    }
}
