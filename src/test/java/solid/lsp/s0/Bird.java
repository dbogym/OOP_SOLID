package solid.lsp.s0;

public abstract class Bird {
    // 모든 새가 할 수 있다고 가정한 행동
    public abstract void fly();
    public void eat() {
        System.out.println("먹이를 먹습니다.");
    }
}
