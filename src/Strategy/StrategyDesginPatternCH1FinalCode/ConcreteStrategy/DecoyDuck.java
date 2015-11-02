package Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy;


import Strategy.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyNoWay;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
