package solid.ocp.s1;

// 비트코인 결제 구현
public class BitcoinPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("비트코인으로 " + amount + "원 결제 처리");
    }
}