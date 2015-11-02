package Strategy.StrategyDesginPatternCH1FinalCode.Context;

import Strategy.StrategyDesginPatternCH1FinalCode.Strategy.QuackBehavior;

/**
 * Created by chetan on 2/11/15.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
