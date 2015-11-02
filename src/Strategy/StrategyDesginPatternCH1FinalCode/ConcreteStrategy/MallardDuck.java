package Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy;

import Strategy.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Strategy.StrategyDesginPatternCH1FinalCode.Context.Quack;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyNoWay;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyWithWings;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.MuteQuack;


public class MallardDuck extends Duck {

	public MallardDuck() {


		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
