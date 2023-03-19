package DP;

public class Marine extends Unit {
    @Override
    public void UnderAttack(int damage) {
        health -= damage;
        System.out.println("남은 체력 : " + health + ", 받은 데미지 : " + damage);
    }
}
