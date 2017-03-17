package designPatterns.strategy.behavior.quack;

public class Squeak implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeaking...");
		
	}
}
