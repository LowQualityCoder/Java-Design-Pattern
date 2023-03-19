package SP;

public class LockDown extends UnitState {
    @Override
    public void Attack() {
        System.out.println("공격 불가!");
    }

    @Override
    public void Move() {
        System.out.println("이동 불가!");
    }
}
