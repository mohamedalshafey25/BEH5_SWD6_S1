package java_Course.session8.interfaces;

public class Visa implements Payment , Refundable{

    @Override
    public void pay(double amount){
        System.out.println("Pay with Visa : "+ amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded from Visa : "+ amount);
    }
}
