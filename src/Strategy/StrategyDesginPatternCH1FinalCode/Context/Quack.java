package Strategy.StrategyDesginPatternCH1FinalCode.Context;
;import Strategy.StrategyDesginPatternCH1FinalCode.Strategy.QuackBehavior;

/**
 * Created by chetan on 2/11/15.
 */ //three quack class which have diffrent behaviour
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
