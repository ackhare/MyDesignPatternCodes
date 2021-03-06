package Behavioural.State.tp.ConcreteStates;

import Behavioural.State.tp.Context;
import Behavioural.State.tp.State;

/**
 * Created by chetan on 10/11/16.
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}