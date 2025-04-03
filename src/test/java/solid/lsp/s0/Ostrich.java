package solid.lsp.s0;

public class Ostrich extends Bird {
    @Override
    public void fly() {
        // 문제 발생! 타조는 날 수 없음
        throw new UnsupportedOperationException("타조는 날 수 없습니다.");
    }
}