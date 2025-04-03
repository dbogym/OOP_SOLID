package solid.ocp.s1;

// 카카오페이 결제 구현 추가
public class KakaoPayPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("카카오페이로 " + amount + "원 결제 처리");
    }
}