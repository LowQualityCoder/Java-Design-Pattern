package CP;

public class UnitManager {
    public void CreateUnit(String unitName, String pointX, String pointY)
    {
        System.out.println(unitName + " 유닛을 X좌표 " + pointX + ", Y좌표 " + pointY + " 위치에 생성합니다.");
    }

    public void DeleteUnit(String unitName, String pointX, String pointY)
    {
        System.out.println(unitName + " 유닛을 X좌표 " + pointX + ", Y좌표 " + pointY + " 위치에서 삭제합니다.");
    }
}
