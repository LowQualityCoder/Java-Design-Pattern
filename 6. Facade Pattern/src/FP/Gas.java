package FP;

public class Gas {
    private int gas = 100;

    public boolean isEnoughGas(int unitGasCost)
    {
        if (unitGasCost <= gas)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
