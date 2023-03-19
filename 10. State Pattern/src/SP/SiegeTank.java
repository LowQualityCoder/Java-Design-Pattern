package SP;

public class SiegeTank {
    private UnitState unitState;

    public SiegeTank(UnitState unitState) {
        this.unitState = unitState;
    }

    public void Attacked(String stateAttack)
    {
        switch(stateAttack)
        {
            case "Medic Blind":
                System.out.println("메딕에게 블라인드 상태이상 공격을 받음");
                this.unitState = new Blind();
                break;

            case "Ghost LockDown":
                System.out.println("고스트에게 락다운 상태이상 공격을 받음");
                this.unitState = new LockDown();
                break;

            default:
                break;
        }
    }

    public void Attack()
    {
        unitState.Attack();
    }

    public void Move()
    {
        unitState.Move();
    }
}
