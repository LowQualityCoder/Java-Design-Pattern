package AP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<NewUnit> ItUnit = new ArrayList<NewUnit>();
        ItUnit.add(new NewUnit());  // 신규 유닛
        ItUnit.add(new Unit());     // 기존 유닛

        for(int i=0;i<ItUnit.size();i++)
        {   //같은 Move() 메소드와 Stop() 메소드로 동작 가능
            NewUnit newUnit = ItUnit.get(i);
            newUnit.Move();
            newUnit.Stop();
        }
    }
}
