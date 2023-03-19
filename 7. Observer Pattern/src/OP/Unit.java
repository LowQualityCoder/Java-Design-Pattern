package OP;

import java.util.ArrayList;

public abstract class Unit {
    private String name;
    private int health;
    private ArrayList<UnitViewer> unitViewers = new ArrayList<UnitViewer>();

    public Unit(String name, int health)
    {
        this.name = name;
        this.health = health;
    }

    public void Attack(UnitViewer investor)
    {
        unitViewers.add(investor);
    }

    public void Detach(UnitViewer investor)
    {
        unitViewers.remove(investor);
    }

    public void Notify()
    {
        for (int i=0;i<unitViewers.size();i++)
        {
            unitViewers.get(i).Update(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        Notify();
    }
}
