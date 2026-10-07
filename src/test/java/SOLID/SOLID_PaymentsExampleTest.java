package SOLID;


import org.junit.jupiter.api.Test;

/**
 *
 * @author xfgt
 */


    







public class SOLID_PaymentsExampleTest {

    // Base class for payment processing
    abstract class PaymentProcessor {
            public abstract void processPayment(double amount); // Pure virtual function
    }

    // Credit card payment processor
    class CreditCardPaymentProcessor extends PaymentProcessor {
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing credit card payment of $" + amount);
        }
    }

        // PayPal payment processor
    class PayPalPaymentProcessor extends PaymentProcessor {
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing PayPal payment of $" + amount);
        }
    }
    @Test 
    void testCreditCard(){
        System.out.println("CreditCard");
        CreditCardPaymentProcessor c = new CreditCardPaymentProcessor();
        c.processPayment(300);
        
    }
    
    @Test 
    void testPayPal(){
        System.out.println("PayPal");
        PayPalPaymentProcessor p = new PayPalPaymentProcessor();
        p.processPayment(340);
    }
    
}
