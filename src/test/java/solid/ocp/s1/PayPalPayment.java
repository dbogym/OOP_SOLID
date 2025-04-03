package solid.ocp.s1;

// 페이팔 결제 구현
public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("페이팔로 " + amount + "원 결제 처리");
    }
}