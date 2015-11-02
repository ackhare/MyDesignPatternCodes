package Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour;

import Strategy.StrategyDesginPatternCH1FinalCode.Strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
