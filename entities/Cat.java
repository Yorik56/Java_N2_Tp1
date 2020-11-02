package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Cat extends Animal implements Terrestrial, Omnivorus {

	public Cat() {
		super();
	}

	public Cat(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	@Override
	public void walk() {
		System.out.println("your cat just walk");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		walk();
	}

	@Override
	public void eat(Eatable eatable) {
		if(eatable instanceof Animal) {
			System.out.println("Your cat, just named: " + this.getName() + "just eat viande");
		}
		else if (eatable instanceof Vegetable){
			System.out.println("Your cat, just named: " + this.getName() + "Just eat herbe");
		}
	}
}
