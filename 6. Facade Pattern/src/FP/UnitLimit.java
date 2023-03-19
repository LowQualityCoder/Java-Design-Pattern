package FP;

public class UnitLimit {
    private int limit = 3;

    public boolean isEnoughLimit(int unitLimitCost)
    {
        if (unitLimitCost <= limit)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
