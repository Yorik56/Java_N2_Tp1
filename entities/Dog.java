package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Dog extends Animal implements Terrestrial, Omnivorus {

	public Dog() {
		super();
	}

	public Dog(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	@Override
	public void walk() {
		System.out.println("your dog just walk");
	}

	@Override
	public void move() {
		walk();

	}

	@Override
	public void eat(Eatable eatable) {
		if(eatable instanceof Animal) {
			System.out.println("Your dog, just named: " + this.getName() + "just eat viande");
		}
		else if (eatable instanceof Vegetable){
			System.out.println("Your dog, just named: " + this.getName() + "Just eat herbe");
		}
	}
}
