package designPatterns.strategy.duckModelation.duckUse;

import designPatterns.strategy.behavior.fly.FlyNoFly;
import designPatterns.strategy.behavior.quack.MuteQuack;
import designPatterns.strategy.duckModelation.Duck;

public class DecoyDuck extends Duck {

	public DecoyDuck(String name) {
		super(new FlyNoFly(), new MuteQuack(), name);
	}
	
	@Override
	public void display() {
		System.out.println("I'm DecoyDuck");
	}
	
}
