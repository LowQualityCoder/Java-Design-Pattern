package AFP;

public class SupplyDepot extends PopulationBuilding {
    @Override
    public void Interact(MainCenterBuilding a) {
        System.out.println(this.getClass().getSimpleName() + " interacts with " + a.getClass().getSimpleName());
    }
}
