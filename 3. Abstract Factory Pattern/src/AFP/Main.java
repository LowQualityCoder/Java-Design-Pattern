package AFP;

public class Main {
    public static void main(String[] args)
    {
        Race race1 = new Terran();
        Game game1 = new Game(race1);
        game1.Show();

        Race race2 = new Protoss();
        Game game2 = new Game(race2);
        game2.Show();
    }
}
