package com.camerons.oopjune.controllers;

import com.camerons.oopjune.classes.Animal;
import com.camerons.oopjune.classes.Deer;
import com.camerons.oopjune.classes.Frog;

public class AnimalController {

	public static void main(String[] args) {
//		Animal an = new Animal();
//		System.out.println(an.getName());
		Frog frog1 = new Frog("Kermit");
		Frog frog2 = new Frog("Hypno-Toad", 5.5, 2);
		Deer deer1 = new Deer("Bambi");
//		deer1.display();
//		System.out.println(Animal.getAnimalCount());
//		System.out.println(Frog.getFrogCount());
//		System.out.println(frog1.getEnergy());
//		System.out.println(frog1.getName());
//		frog1.jump();
//		frog1.jump();
		frog1.move("swim");
		frog1.move("swim");
		frog1.move("jump");
		frog1.eat(5);
		frog1.eat(5);
		frog1.eat(5);
		deer1.move("run");
		deer1.eat(30);
		deer1.eat(30);
//		deer1.run();
//		deer1.run();
		frog1.display();
		deer1.display();
		
	}

}
