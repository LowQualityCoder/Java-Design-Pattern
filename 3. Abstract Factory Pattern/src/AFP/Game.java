package AFP;

public class Game {
    private MainCenterBuilding msb;
    private PopulationBuilding pb;

    public Game(Race race)
    {
        msb = race.CreateMainCenterBuilding();
        pb = race.CreatePopulationBuilding();
    }

    public void Show()
    {
        pb.Interact(msb);
    }
}
