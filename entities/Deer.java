package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Deer extends Animal implements Terrestrial, Herbivorus {

	public Deer() {
		super();
	}

	public Deer(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	@Override
	public void walk() {
		System.out.println("your Deer just walk");
	}

	@Override
	public void move() {
		walk();
	}

	@Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Animal) {
			System.out.println("Your Deer, just named: " + this.getName() + "cannot eat viande");
		} else if (eatable instanceof Vegetable) {
			System.out.println("Your Deer, just named: " + this.getName() + "Just eat herbe");
		}

	}
}
