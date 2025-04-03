package solid.ocp.s0;

public class PaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("creditCard")) {
            processCreditCardPayment(amount);
        } else if (paymentType.equals("paypal")) {
            processPayPalPayment(amount);
        } else if (paymentType.equals("bitcoin")) {
            processBitcoinPayment(amount);
        }
        // 새로운 결제 방식이 추가될 때마다 여기에 else if를 추가해야 함
    }

    private void processCreditCardPayment(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 처리");
    }

    private void processPayPalPayment(double amount) {
        System.out.println("페이팔로 " + amount + "원 결제 처리");
    }

    private void processBitcoinPayment(double amount) {
        System.out.println("비트코인으로 " + amount + "원 결제 처리");
    }
}
