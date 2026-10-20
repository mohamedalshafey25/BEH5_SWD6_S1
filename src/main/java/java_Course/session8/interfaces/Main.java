package java_Course.session8.interfaces;

public class Main {
    public static void main(String[] args) {

        Payment pay1 = new Visa();
        Payment pay2 = new PayPal();

        pay1.pay(2500.36);
        pay2.pay(3200.56);



    }
}
