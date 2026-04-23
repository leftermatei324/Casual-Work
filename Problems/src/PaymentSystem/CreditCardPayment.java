package PaymentSystem;

public class CreditCardPayment extends Payment{
    private String cardNumber;

    public void setCardNumber(String cardNumber){
        if (cardNumber != null && cardNumber.length() == 19){
            this.cardNumber = cardNumber;
        }else {
            System.out.println("Card number must have 16 digit. ");
        }
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public CreditCardPayment(double amount, String cardNumber){
        super(amount);
        setCardNumber(cardNumber);
    }

    @Override
    public void ProcessPayment() {
        System.out.println("Processing credit card payment");
        System.out.println("Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}
