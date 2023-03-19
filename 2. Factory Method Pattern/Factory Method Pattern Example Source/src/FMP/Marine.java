package FMP;

public class Marine extends Unit {
    @Override
    public void Move(String _strPoint) {
        System.out.println(m_strName + " : " + _strPoint + " 이동 완료");
    }

    @Override
    public void Attacked(Unit _unitTarget) {
        this.m_intHealth -= _unitTarget.m_intAttackPower;
        System.out.println(m_strName + " 공격당함 : 공격자 ->" + _unitTarget.m_strName + " : 남은 체력 " + this.m_intHealth);
    }

    public Marine(String _strName)
    {
        this.m_strName = _strName;
        this.m_intAttackPower = 15;
        this.m_intHealth = 100;
        System.out.println(_strName + " 생성 완료");
    }
}
