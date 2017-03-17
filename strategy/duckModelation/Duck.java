package designPatterns.strategy.duckModelation;

import designPatterns.strategy.behavior.fly.IFlyBehavior;
import designPatterns.strategy.behavior.quack.IQuackBehavior;

public abstract class Duck {

	private IFlyBehavior iFlyBehavior;
	private IQuackBehavior iQuackBehavior;
	private String name;
	
	public Duck(){}
	
	public Duck(IFlyBehavior iFlyBehavior, IQuackBehavior iQuackBehavior, String name) {
		super();
		this.iFlyBehavior = iFlyBehavior;
		this.iQuackBehavior = iQuackBehavior;
		this.name = name;
	}

	public abstract void display();
	
	public void performFly(){
		iFlyBehavior.fly();
	}
	
	public void performQuack(){
		iQuackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("(All ducks swim) Swiming...");
	}

	public IFlyBehavior getiFlyBehavior() {
		return iFlyBehavior;
	}

	public void setiFlyBehavior(IFlyBehavior iFlyBehavior) {
		this.iFlyBehavior = iFlyBehavior;
	}

	public IQuackBehavior getiQuackBehavior() {
		return iQuackBehavior;
	}

	public void setiQuackBehavior(IQuackBehavior iQuackBehavior) {
		this.iQuackBehavior = iQuackBehavior;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
