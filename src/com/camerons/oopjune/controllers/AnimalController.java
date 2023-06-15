package com.camerons.oopjune.controllers;

import com.camerons.oopjune.classes.Animal;
import com.camerons.oopjune.classes.Deer;
import com.camerons.oopjune.classes.Frog;

public class AnimalController {

	public static void main(String[] args) {
		Animal an = new Animal();
//		System.out.println(an.getName());
		Frog frog1 = new Frog("Kermit");
		Deer deer1 = new Deer("Bambi");
		deer1.display();
//		System.out.println(Animal.getAnimalCount());
//		System.out.println(Frog.getFrogCount());
//		System.out.println(frog1.getEnergy());
//		System.out.println(frog1.getName());
//		frog1.jump();
//		frog1.jump();
//		frog1.jump();
//		frog1.display();
		deer1.run();
		deer1.run();
		deer1.run();
		deer1.run();
		deer1.run();
		deer1.run();
		deer1.display();
		
	}

}
