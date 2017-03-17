package designPatterns.strategy.duckModelation.duckUse;

import designPatterns.strategy.behavior.fly.FlyNoFly;
import designPatterns.strategy.behavior.quack.Quack;
import designPatterns.strategy.duckModelation.Duck;

public class ModelDuck extends Duck {

	public ModelDuck(String name) {
		super(new FlyNoFly(), new Quack(), name);
	}
	
	@Override
	public void display() {
		System.out.println("I'm ModelDuck");
		
	}
}
