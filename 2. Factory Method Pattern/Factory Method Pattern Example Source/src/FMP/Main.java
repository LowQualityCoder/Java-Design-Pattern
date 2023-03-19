package FMP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Building[] buildings = new Building[2];

        buildings[0] = new Barrack();
        buildings[1] = new Starport();

        ArrayList<Unit> ItAllUnit = new ArrayList<Unit>();

        ItAllUnit.add(buildings[0].MakeUnit("적 마린"));
        ItAllUnit.add(buildings[1].MakeUnit("아군 드랍쉽"));

        ItAllUnit.get(0).Move("언덕");
        Unit unitMarine = ItAllUnit.get(0);
        ItAllUnit.get(1).Attacked(unitMarine);
    }
}
