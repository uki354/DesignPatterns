package StatePattern;

public class Context {

    private State state;

    public Context(){
        this.state = new RunningState();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }







}
