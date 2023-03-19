package FP;

public class Mineral {
    private int mineral = 100;

    public boolean isEnoughMineral(int unitMineralCost)
    {
        if (unitMineralCost <= mineral)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
