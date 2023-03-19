package FP;

public class UnitCreateable {
    Mineral mineral = new Mineral();
    Gas gas = new Gas();
    UnitLimit unitLimit = new UnitLimit();

    public boolean isUnitCreateable(int unitMineralCost, int unitGasCost, int unitLimitCost)
    {
        if (!mineral.isEnoughMineral(unitMineralCost))
        {
            return false;
        }
        else if (!gas.isEnoughGas(unitGasCost))
        {
            return false;
        }
        else if (!unitLimit.isEnoughLimit(unitLimitCost))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
