package com.camerons.oopjune.classes;

public class Frog extends Animal{
//	Member Variables ------------------------
	static int frogCount;

//	Constructors ----------------------------
	public Frog(String name) {
		super(name);
		this.setEnergy(10);
		frogCount++;
	}
	public Frog(String name, double height, int weight) {
		super(name);
		this.setHeight(height);
		this.setWeight(weight);
		this.setEnergy(10);
		frogCount++;
	}
//	Class Methods ------------------------------
	public void display() {
		System.out.println("Frog Class");
		super.display();
		System.out.printf("All Frogs: %s\n", frogCount);
	}
	
	public void jump(int energyUsed) {
		if(this.isLivingCheck()) {
			this.setEnergy(this.getEnergy()-energyUsed);;
			System.out.printf("%s Hop Hop\n", this.getName());
		}else {
			System.out.printf("%s is dead, you cant hop.\n", this.getName());		
		}
	}
	public void swim(int energyUsed) {
		if(this.isLivingCheck()) {
			this.setEnergy(this.getEnergy()-energyUsed);;
			System.out.printf("%s swim swim\n", this.getName());
		}else {
			System.out.printf("%s is dead, you float.\n", this.getName());		
		}
	}
	public void move(String movementType) {
		switch(movementType) {
		case "jump":
			jump(5);
			break;
		case "swim":
			swim(10);
			break;
		default:
			System.out.println("Invalid movement type");
			break;
		}
	}
//	Getters & Setters ------------------------
	public static int getFrogCount() {
		return frogCount;
	}

	public static void setFrogCount(int frogCount) {
		Frog.frogCount = frogCount;
	}
	
	
	
	
}
