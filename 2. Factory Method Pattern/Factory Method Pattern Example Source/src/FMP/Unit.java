package FMP;

public abstract class Unit {
    public String m_strName;
    public int m_intAttackPower;
    public int m_intHealth;

    public abstract void Move(String _strPoint);
    public abstract void Attacked(Unit _unitTarget);
}
