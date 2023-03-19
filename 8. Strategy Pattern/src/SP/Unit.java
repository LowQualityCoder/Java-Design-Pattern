package SP;

public class Unit {
    private Moveable moveable;
    private Attackable attackable;

    public Unit(Moveable moveable, Attackable attackable) {
        this.moveable = moveable;
        this.attackable = attackable;
    }

    public void Attack()
    {
        attackable.AttackEnemy();
    }

    public void Move()
    {
        moveable.Move();
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }
}
