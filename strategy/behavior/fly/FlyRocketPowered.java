package designPatterns.strategy.behavior.fly;

public class FlyRocketPowered implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying with Rocket!!!");
	}
}
