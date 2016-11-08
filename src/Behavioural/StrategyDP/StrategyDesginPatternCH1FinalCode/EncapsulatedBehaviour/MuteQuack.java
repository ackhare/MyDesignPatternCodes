package Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour;

import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
