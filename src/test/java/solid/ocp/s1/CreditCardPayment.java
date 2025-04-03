package solid.ocp.s1;

// 신용카드 결제 구현
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 처리");
    }
}