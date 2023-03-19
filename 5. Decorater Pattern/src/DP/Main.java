package DP;

public class Main {
    public static void main(String[] args)
    {
        Marine marine = new Marine();
        DefensiveMatrix defensiveMatrix = new DefensiveMatrix();

        defensiveMatrix.SetComponent(marine);

        defensiveMatrix.UnderAttack(60);
        defensiveMatrix.UnderAttack(60);
        defensiveMatrix.UnderAttack(60);
    }
}
