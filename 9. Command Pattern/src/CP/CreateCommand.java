package CP;

public class CreateCommand extends Command {
    private UnitManager unitManager;

    public CreateCommand(UnitManager unitManager, String unitName, String pointX, String pointY) {
        this.unitManager = unitManager;
        this.unitName = unitName;
        this.pointX = pointX;
        this.pointY = pointY;
    }

    @Override
    public void Execute() {
        unitManager.CreateUnit(this.unitName, this.pointX, this.pointY);
    }
}
