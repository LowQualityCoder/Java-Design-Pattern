package DP;

public class DefensiveMatrix extends UnitDecorator {
    private int addedHealth = 100;
    private int damage = 0;

    @Override
    public void UnderAttack(int damage) {
        CheckDefensiveMatrix(damage);
        super.UnderAttack(this.damage);
    }

    void CheckDefensiveMatrix(int damage)
    {
        int remainHealth = addedHealth - damage;

        if (remainHealth >= 0)
        {
            addedHealth -= damage;
            System.out.println("보호막으로 데미지 " + damage + " 모두 흡수, 남은 보호막 : " + remainHealth);
            this.damage = 0;
        }
        else
        {
            if (addedHealth == 0)
            {
                System.out.println("보호막으로 흡수 못함, 남은 보호막 : 0");
                this.damage = damage;
            }
            else
            {
                System.out.println("보호막으로 데미지 " + (damage - addedHealth) + "만 흡수, 남은 보호막 : 0");
                this.damage = damage - addedHealth;
                addedHealth = 0;
            }
        }
    }
}
