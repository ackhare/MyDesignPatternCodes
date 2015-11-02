package Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour;


import Strategy.StrategyDesginPatternCH1FinalCode.Strategy.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
