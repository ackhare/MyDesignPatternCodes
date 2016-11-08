package Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour;


import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Strategy.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
