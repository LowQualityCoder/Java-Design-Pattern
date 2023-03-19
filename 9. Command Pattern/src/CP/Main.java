package CP;

public class Main {
    public static void main(String[] args)
    {
        MapEditor mapEditor = new MapEditor();

        mapEditor.Create("마린1", "100", "200");
        mapEditor.Create("마린2", "200", "400");
        mapEditor.Create("마린3", "300", "600");
        mapEditor.Delete("마린2", "300", "600");

        mapEditor.Undo(3);
        mapEditor.Redo(3);
    }
}
