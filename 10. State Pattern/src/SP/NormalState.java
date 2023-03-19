package SP;

public class NormalState extends UnitState {
    @Override
    public void Attack() {
        System.out.println("공격 가능");
    }

    @Override
    public void Move() {
        System.out.println("이동 가능 시야 10");
    }
}
