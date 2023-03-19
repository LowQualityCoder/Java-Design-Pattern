package CP;

public class DeleteCommand extends Command {
    private UnitManager unitManager;

    public DeleteCommand(UnitManager unitManager, String unitName, String pointX, String pointY) {
        this.unitManager = unitManager;
        this.unitName = unitName;
        this.pointX = pointX;
        this.pointY = pointY;
    }

    @Override
    public void Execute() {
        unitManager.DeleteUnit(this.unitName, this.pointX, this.pointY);
    }
}
