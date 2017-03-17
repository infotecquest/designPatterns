package designPatterns.strategy.behavior.quack;

public class MuteQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("No quacking...");
		
	}
}
