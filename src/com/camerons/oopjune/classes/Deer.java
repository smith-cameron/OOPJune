package com.camerons.oopjune.classes;

public class Deer extends Animal{
//	Member Variables ------------------------
	static int deerCount;

	

//	Constructors ----------------------------
	public Deer(String name) {
		super(name);
		this.energy = 30;
		deerCount++;
	}

//	Class Methods ------------------------------
	public void display() {
		System.out.println("Deer Class");
		super.display();
		System.out.printf("All Deer: %s\n", deerCount);
	}
	
	public void run(int energyUsed) {
		if(this.isLivingCheck()) {
			super.decrementEnergy(energyUsed);
			System.out.printf("%s Hop Hop(But this is a deer)\n", this.getName());			
		}else {
			System.out.printf("Dead %s's dont jump\n", this.getName());
		}
	}
	public void move(String movementType) {
		switch(movementType) {
		case "run":
			run(10);
			break;
		default:
			System.out.println("Invalid movement type");
			break;
		}
	}

	@Override
	public void eat(int energy) {
		System.out.println("Deer Eating");
		this.energy += energy;
		
	}
	
//	Getters & Setters ------------------------
	
}
