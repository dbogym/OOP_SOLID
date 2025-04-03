package solid.ocp;

import solid.ocp.s1.*;

// 클라이언트 코드
public class Client {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // 신용카드 결제
        processor.processPayment(new CreditCardPayment(), 10000);

        // 페이팔 결제
        processor.processPayment(new PayPalPayment(), 20000);

        // 비트코인 결제
        processor.processPayment(new BitcoinPayment(), 30000);

        // 새로 추가된 카카오페이 결제
        processor.processPayment(new KakaoPayPayment(), 15000);
    }
}