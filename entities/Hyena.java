package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Hyena extends Animal implements Terrestrial, Carnivorus {

	public Hyena() {
		super();
	}

	public Hyena(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	@Override
	public void walk() {
		System.out.println("your hyenna just walk");
	}

	@Override
	public void move() {
		walk();
	}

	@Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Animal) {
			System.out.println("Your Hyenna, just named: " + this.getName() + "just eat viande");
		} else if (eatable instanceof Vegetable) {
			System.out.println("Your Hyenna, just named: " + this.getName() + "cannot eat herbe");
		}
	}
}
