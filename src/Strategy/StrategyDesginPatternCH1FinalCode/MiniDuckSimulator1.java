package Strategy.StrategyDesginPatternCH1FinalCode;

import Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.MallardDuck;
import Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.ModelDuck;
import Strategy.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyRocketPowered;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
