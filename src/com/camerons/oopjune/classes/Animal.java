package com.camerons.oopjune.classes;

public class Animal {
//	Member Variables ------------------------
	private String name;
	private double height;
	private int weight;
	private int energy = 20;
	private boolean isLiving = true;
	static int animalCount;
	
//	Constructors ----------------------------
	public Animal(){
		this.name = "default123";
		animalCount++;
	}
	
	public Animal(String name){
		this.name = name;
		animalCount++;
	}
//	public Animal(String name, double height, int weight){
//		this.name = name;
//		this.height = height;
//		this.weight = weight;
//		animalCount++;
//	}
//	Class Methods ------------------------------
	public void display() {
		System.out.println("Animal Class");
		System.out.printf("Name: %s\n", this.name);
		System.out.printf("Energy: %s\n", this.energy);
		System.out.printf("All Animals: %s\n", animalCount);
	}
	
	public boolean isLivingCheck() {
		if (this.energy <= 0) {
			this.setLiving(false);
			return this.isLiving;
		}else {
			return this.isLiving;
		}
	}
	
	protected void decrementEnergy(int value) {
		this.energy -= value;
	}
//	Getters & Setters ------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public static int getAnimalCount() {
		return animalCount;
	}

	public static void setAnimalCount(int animalCount) {
		Animal.animalCount = animalCount;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public boolean isLiving() {
		return isLiving;
	}

	public void setLiving(boolean isLiving) {
		this.isLiving = isLiving;
	}
	
}
