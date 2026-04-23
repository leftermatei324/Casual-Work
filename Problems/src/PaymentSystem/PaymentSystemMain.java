package PaymentSystem;

public class PaymentSystemMain {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(200, "1234-5678-9123-4563");
        Payment p2 = new CashPayment(69);
        Payment p3 = new PayPalPayment(20);

        p1.ProcessPayment();
        p1.printReceipt();

        System.out.println();

        p2.ProcessPayment();
        p2.printReceipt();

        System.out.println();

        p3.ProcessPayment();
        p3.printReceipt();
    }
}
