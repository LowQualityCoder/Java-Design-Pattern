package AP;

public class Unit extends NewUnit {

    private OldUnit adaptee = new OldUnit();

    @Override
    public void Move() {
        adaptee.MoveToPoint();
    }

    @Override
    public void Stop() {
        adaptee.StopMove();
    }
}
