package Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour;

import Strategy.StrategyDesginPatternCH1FinalCode.Strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
