package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Tetrapoda;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

	public Turtle() {
		super();
	}

	public Turtle(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	@Override
	public void walk() {
		System.out.println("your cat just walk");
	}

	@Override
	public void swim() {
		System.out.println("your turtle just swim");
	}


	@Override
	public void move() {
		walk();
		swim();
	}

	@Override
	public void eat(Eatable eatable) {
		// TODO Auto-generated method stub
		if(eatable instanceof Animal) {
			System.out.println("Your turtle, just named: " + this.getName() + "just eat viande");
		}
		else if (eatable instanceof Vegetable){
			System.out.println("Your turtle, just named: " + this.getName() + "Just eat herbe");
		}
	}
}
