package StatePattern;

public class StartState  implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("start state");

    }
}
