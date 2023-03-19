package CP;

import java.util.ArrayList;

public class MapEditor {
    private UnitManager unitManager = new UnitManager();
    private ArrayList<Command> commands = new ArrayList<Command>();
    private int current = 0;

    public void Create(String unitName, String pointX, String pointY)
    {
        Command command = new CreateCommand(unitManager, unitName, pointX, pointY);
        command.Execute();

        commands.add(command);
        current++;
    }

    public void Delete(String unitName, String pointX, String pointY)
    {
        Command command = new DeleteCommand(unitManager, unitName, pointX, pointY);
        command.Execute();

        commands.add(command);
        current++;
    }

    public void Redo(int levels)
    {
        System.out.println("\n---- Redo " + levels + " levels ");

        for (int i=0;i<levels;i++)
        {
            if (current <= commands.size() - 1)
            {
                Command command = commands.get(current++);
                command.Execute();
            }
        }
    }

    public void Undo(int levels)
    {
        System.out.println("\n---- Undo " + levels + " levels ");

        for (int i=0;i<levels;i++)
        {
            if (current > 0)
            {
                Command command = commands.get(--current);
                if (command != null)
                {
                    Command commandTemp = new DeleteCommand(unitManager, command.unitName, command.pointX, command.pointY);
                    commandTemp.Execute();
                }
                else
                {
                    Command commandTemp = new CreateCommand(unitManager, command.unitName, command.pointX, command.pointY);
                    commandTemp.Execute();
                }
            }
        }
    }
}
