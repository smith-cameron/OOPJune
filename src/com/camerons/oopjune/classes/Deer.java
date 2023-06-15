package com.camerons.oopjune.classes;

public class Deer extends Animal{
	static int deerCount;

	
	
	public Deer(String name) {
		super(name);
		this.energy = 30;
		deerCount++;
	}
	
	public void display() {
		System.out.println("Deer Class");
		super.display();
		System.out.printf("All Deer: %s\n", deerCount);
	}
	
	public void run() {
		if(this.isLivingCheck()) {
			super.decrementEnergy(15);
			System.out.printf("%s Hop Hop\n", this.getName());			
		}else {
			System.out.printf("%s dead, you cant jump.\n", this.getName());
		}
	}
}
