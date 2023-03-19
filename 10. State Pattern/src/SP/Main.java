package SP;

public class Main {
    public static void main(String[] args)
    {
        SiegeTank st = new SiegeTank(new NormalState());

        st.Attack();
        st.Move();

        System.out.println();
        st.Attacked("Medic Blind");

        st.Attack();
        st.Move();

        System.out.println();
        st.Attacked("Ghost LockDown");
        st.Attack();
        st.Move();
    }
}
