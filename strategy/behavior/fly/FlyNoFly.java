package designPatterns.strategy.behavior.fly;

public class FlyNoFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("No Flying...");
	}
}
