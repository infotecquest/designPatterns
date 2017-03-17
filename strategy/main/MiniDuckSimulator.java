package designPatterns.strategy.main;

import designPatterns.strategy.behavior.fly.FlyRocketPowered;
import designPatterns.strategy.duckModelation.Duck;
import designPatterns.strategy.duckModelation.duckUse.DecoyDuck;
import designPatterns.strategy.duckModelation.duckUse.MallardDuck;
import designPatterns.strategy.duckModelation.duckUse.ModelDuck;
import designPatterns.strategy.duckModelation.duckUse.RubberDuck;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck decoy = new DecoyDuck("DecoyDuck_1");
		displayInfo(decoy);
		
		Duck mallard = new MallardDuck("MallardDuck_1");
		displayInfo(mallard);
		
		Duck rubber = new RubberDuck("RubberDuck_1");
		displayInfo(rubber);
		
		System.out.println("############");
		Duck model = new ModelDuck("ModelDuck_1");
		displayInfo(model);
		model.setiFlyBehavior(new FlyRocketPowered());
		displayInfo(model);
		
	}
	
	private static void displayInfo(Duck duck){
		System.out.println(duck.getName());
		System.out.print(" - ");
		
		duck.display();
		System.out.print(" - ");
		
		duck.performFly();
		System.out.print(" - ");
		
		duck.performQuack();
		System.out.print(" - ");
		
		duck.swim();
		System.out.println(" --------- ");
		
	}
}
