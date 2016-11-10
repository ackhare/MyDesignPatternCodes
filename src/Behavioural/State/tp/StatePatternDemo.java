package Behavioural.State.tp;

import Behavioural.State.tp.ConcreteStates.StartState;
import Behavioural.State.tp.ConcreteStates.StopState;

/**
 * Created by chetan on 10/11/16.
 */
public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();
//so here is a concrete class called context whose behaviour meaning that
// when doAction is called its state is changed through setState in concrete state

      StartState startState = new StartState();
      startState.doAction(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
   }
}
/*
output is

Player is in start state
Start State
Player is in stop state
Stop State




 */