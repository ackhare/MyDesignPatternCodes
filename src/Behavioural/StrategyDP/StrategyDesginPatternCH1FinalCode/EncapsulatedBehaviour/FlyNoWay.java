package Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour;

import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
