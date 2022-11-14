package StatePattern;

public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("stop state");
    }
}
