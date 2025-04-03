package solid.isp;

public class Dog implements Eatable, Swimable {
    @Override
    public void eat() {
        System.out.println("강아지가 먹이를 먹습니다.");
    }

    @Override
    public void swim() {
        System.out.println("강아지가 수영합니다.");
    }
}
