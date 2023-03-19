package AFP;

public class Pylon extends PopulationBuilding {
    @Override
    public void Interact(MainCenterBuilding a) {
        System.out.println(this.getClass().getSimpleName() + " interacts with " + a.getClass().getSimpleName());
    }
}
