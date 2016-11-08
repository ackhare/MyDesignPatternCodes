package Behavioural.StrategyDP.tp;

import Behavioural.StrategyDP.tp.Context.Context;
import Behavioural.StrategyDP.tp.Strategy.OperationAdd;
import Behavioural.StrategyDP.tp.Strategy.OperationSubstract;

/**
 * Created by chetan on 8/11/16.
 */

//Use the Context to see change in behaviour when it changes its Strategy.
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
//Because context takes a startegy interface we can just go ahead and replace its concrete implementation
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

//        context = new Context(new OperationMultiply());
//        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
