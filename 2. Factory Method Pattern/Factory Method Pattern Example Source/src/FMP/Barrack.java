package FMP;

public class Barrack extends Building {
    @Override
    public Unit MakeUnit(String _strName) {
        return new Marine(_strName);
    }
}
