package designPatterns.strategy.duckModelation.duckUse;

import designPatterns.strategy.behavior.fly.FlyNoFly;
import designPatterns.strategy.behavior.quack.Squeak;
import designPatterns.strategy.duckModelation.Duck;

public class RubberDuck extends Duck {
	
	public RubberDuck(String name) {
		super(new FlyNoFly(), new Squeak(), name);
	}

	@Override
	public void display() {
		System.out.println("I'm RubberDuck");
	}

}
