package DP;

public abstract class UnitDecorator extends Unit {
    protected Unit component;

    public void SetComponent(Unit component)
    {
        this.component = component;
    }

    @Override
    public void UnderAttack(int damage) {
        if (component != null)
        {
            component.UnderAttack(damage);
        }
    }
}
