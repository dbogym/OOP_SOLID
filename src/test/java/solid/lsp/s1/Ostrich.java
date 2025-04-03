package solid.lsp.s1;

public class Ostrich implements NonFlyingBird {
    @Override
    public void eat() {
        System.out.println("타조가 먹이를 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("타조가 빠르게 달립니다.");
    }
}