package Behavioural.State.tp;

/**
 * Created by chetan on 10/11/16.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }
//by applying seteer and getter decoupling and run time changes are achieved
    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
