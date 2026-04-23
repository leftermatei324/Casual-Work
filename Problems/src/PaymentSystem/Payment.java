package PaymentSystem;

public abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract void ProcessPayment();

    public void printReceipt(){
        System.out.println("Payment of " + amount + " lei was succesfully done!");
    }
}
