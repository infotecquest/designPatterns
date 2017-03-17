package designPatterns.strategy.behavior.quack;

public class Quack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quacking...");
		
	}
}
