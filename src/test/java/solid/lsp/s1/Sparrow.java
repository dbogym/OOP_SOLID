package solid.lsp.s1;

public class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("참새가 먹이를 먹습니다.");
    }

    @Override
    public void fly() {
        System.out.println("참새가 날아갑니다.");
    }
}