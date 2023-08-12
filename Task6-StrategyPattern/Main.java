public class Main {
    public static void main(String[] args) {
        PaymentService cart = new PaymentService();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy paypalPayment = new PayPalPayment("prottoychakroborty.com");

        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(200);

        cart.setPaymentStrategy(paypalPayment);
        cart.checkout(150);
    }
}

