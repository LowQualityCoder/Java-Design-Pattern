package SP;

public class NoAttack extends Attackable {
    @Override
    public void AttackEnemy() {
        System.out.println("Can not Attack");
    }
}
