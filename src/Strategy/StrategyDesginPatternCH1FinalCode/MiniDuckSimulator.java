package Strategy.StrategyDesginPatternCH1FinalCode;

import Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.DecoyDuck;
import Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.MallardDuck;
import Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.ModelDuck;
import Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.RubberDuck;
import Strategy.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyRocketPowered;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
