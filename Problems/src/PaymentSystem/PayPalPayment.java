package PaymentSystem;

public class PayPalPayment extends Payment{

    public PayPalPayment(double amount){
        super(amount);
    }

    @Override
    public void ProcessPayment() {
        System.out.println("Processing PayPal payment....");
    }
}
