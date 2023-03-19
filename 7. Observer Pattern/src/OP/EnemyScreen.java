package OP;

public class EnemyScreen implements UnitViewer {
    private Unit unit;

    @Override
    public void Update(Unit unit) {
        this.unit = unit;
        System.out.println("적 상태창 " + this.unit.getName() + " 상태 변경 : 체력 " + this.unit.getHealth());
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
