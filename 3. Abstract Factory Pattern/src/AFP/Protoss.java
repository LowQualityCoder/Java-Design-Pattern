package AFP;

public class Protoss extends Race {
    @Override
    public MainCenterBuilding CreateMainCenterBuilding() {
        return new Nexus();
    }

    @Override
    public PopulationBuilding CreatePopulationBuilding() {
        return new Pylon();
    }
}
