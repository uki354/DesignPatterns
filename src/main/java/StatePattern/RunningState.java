package StatePattern;

public class RunningState implements State{



    @Override
    public void doAction(Context context){
        System.out.println("Running state");
    }
}
