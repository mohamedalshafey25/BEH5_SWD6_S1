package java_Course.session8.interfaces;

public class PayPal implements Payment , Refundable{

    @Override
    public void pay(double amount) {
        System.out.println("Pay with PayPal : "+ amount);
    }
    @Override
    public void refund(double amount) {
        System.out.println("Refunded from PayPal : "+ amount);
    }
}
