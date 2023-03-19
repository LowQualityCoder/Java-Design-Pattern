package FMP;

public class Starport extends Building {
    @Override
    public Unit MakeUnit(String _strName) {
        return new Dropship(_strName);
    }
}
