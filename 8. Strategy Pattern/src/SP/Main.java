package SP;

public class Main {
    public static void main(String[] args)
    {
        Unit unit = new Marine(new MoveLand(), new Attack());
        unit.Move();
        unit.Attack();

        unit = new Medic(new MoveLand(), new NoAttack());
        unit.Move();
        unit.Attack();

        unit = new Wrath(new MoveSky(), new Attack());
        unit.Move();
        unit.Attack();

        System.out.println();
        System.out.println("Medic has a Special Attack");
        System.out.println();

        unit = new Medic(new MoveLand(), new SpecialAttack());
        unit.Move();
        unit.Attack();
    }
}
