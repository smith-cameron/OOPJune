package com.camerons.oopjune.classes;

public class Frog extends Animal{
	static int frogCount;

	public Frog(String name) {
		super(name);
		this.energy = 10;
		frogCount++;
	}
	
	public void display() {
		System.out.println("Frog Class");
		super.display();
		System.out.printf("All Frogs: %s\n", frogCount);
	}
	
	public void jump() {
		if(this.isLivingCheck()) {
			super.decrementEnergy(5);
		}else {
			super.decrementEnergy(5);
			System.out.printf("%s dead, you cant hop.\n", this.getName());		
		}
	}
	
	public static int getFrogCount() {
		return frogCount;
	}

	public static void setFrogCount(int frogCount) {
		Frog.frogCount = frogCount;
	}
	
	
	
	
}
