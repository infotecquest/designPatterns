package designPatterns.strategy.duckModelation.duckUse;

import designPatterns.strategy.behavior.fly.FlyWithWings;
import designPatterns.strategy.behavior.fly.IFlyBehavior;
import designPatterns.strategy.behavior.quack.IQuackBehavior;
import designPatterns.strategy.behavior.quack.Quack;
import designPatterns.strategy.duckModelation.Duck;

public class MallardDuck extends Duck {

	public MallardDuck(String name) {
		super();
		
		IFlyBehavior iFlyBehavior = new FlyWithWings();
		super.setiFlyBehavior(iFlyBehavior);
		
		IQuackBehavior iQuackBehavior = new Quack();
		super.setiQuackBehavior(iQuackBehavior);
		super.setName(name);
	}
	
	@Override
	public void display() {
		System.out.println("I'm MallardDuck");
	}
	
}
