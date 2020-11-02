package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

	public Dolphin() {
		super();
	}

	public Dolphin(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	@Override
	public void move() {
		swim();
	}

	@Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Animal) {
			System.out.println("Your Dolphin, just named: " + this.getName() + "just eat viande");
		} else if (eatable instanceof Vegetable) {
			System.out.println("Your Dolphin, just named: " + this.getName() + "cannot eat herbe");
		}
	}

	@Override
	public void swim() {
		System.out.println("your dolphin just swim");
	}
}
