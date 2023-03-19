package OP;

public class Main {
    public static void main(String[] args)
    {
        Marine ourMarine = new Marine("아군 마린", 100);
        ourMarine.Attack(new MainScreen());
        ourMarine.Attack(new StatusScreen());
        ourMarine.Attack(new EnemyScreen());

        ourMarine.setHealth(60);
        ourMarine.setHealth(40);
    }
}
