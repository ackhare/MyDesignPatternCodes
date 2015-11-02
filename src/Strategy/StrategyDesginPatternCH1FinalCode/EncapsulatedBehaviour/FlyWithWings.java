package Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour;

import Strategy.StrategyDesginPatternCH1FinalCode.Strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
