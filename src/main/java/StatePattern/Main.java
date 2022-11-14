package StatePattern;

public class Main {

    /** State design pattern is useful when there is a need for alerting behaviour of the code
     depending on current state of the context object.
     E.G. When there are a bunch of if-else or switch statements
     Main goal is to extract those statements into separate concrete classes which will be implementing common interface
     Main object, referred as Context, have State instance object to which it delegates all state specific code. */

    public static void main(String[] args) {

        Context context = new Context();
        context.getState().doAction(context); // initial state

        context.setState(new StartState()); // changed to start state
        context.getState().doAction(context);

        context.setState(new StopState()); // changed to stop state
        context.getState().doAction(context);

    }


}
