package FP;

public class Main {
    public static void main(String[] args)
    {
        UnitCreateable unitCreateable = new UnitCreateable();

        if (unitCreateable.isUnitCreateable(50, 30, 2) == true)
        {
            System.out.println("유닛 생성 가능!");
        }
        else
        {
            System.out.println("유닛 생성 불가능!");
        }

        if (unitCreateable.isUnitCreateable(50, 130, 2) == true)
        {
            System.out.println("유닛 생성 가능!");
        }
        else
        {
            System.out.println("유닛 생성 불가능!");
        }

        if (unitCreateable.isUnitCreateable(50, 30, 5) == true)
        {
            System.out.println("유닛 생성 가능!");
        }
        else
        {
            System.out.println("유닛 생성 불가능!");
        }
    }
}
