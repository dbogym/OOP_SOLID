package solid.ocp.s1;

// 결제 방식에 대한 추상 인터페이스
public interface PaymentMethod {
    void processPayment(double amount);
}
