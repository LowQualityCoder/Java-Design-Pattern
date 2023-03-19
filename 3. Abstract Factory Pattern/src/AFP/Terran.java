package AFP;

public class Terran extends Race {
    @Override
    public MainCenterBuilding CreateMainCenterBuilding() {
        return new CommandCenter();
    }

    @Override
    public PopulationBuilding CreatePopulationBuilding() {
        return new SupplyDepot();
    }
}
