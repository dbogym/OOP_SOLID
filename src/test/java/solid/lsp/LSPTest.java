package solid.lsp;

import solid.lsp.s0.Bird;
import solid.lsp.s0.Ostrich;
import solid.lsp.s0.Sparrow;


// 클라이언트 코드
public class LSPTest {
    public static void main(String[] args) {
        letBirdFly(new Sparrow()); // 정상 작동
        letBirdFly(new Ostrich()); // 런타임 오류 발생!
    }

    public static void letBirdFly(Bird bird) {
        bird.fly(); // Ostrich에서 예외 발생
    }
}
