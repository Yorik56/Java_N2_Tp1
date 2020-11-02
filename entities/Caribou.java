package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Caribou extends Animal implements Terrestrial, Herbivorus {

	 public Caribou() {
	    super();
	 }
	
	 public Caribou(Long id, String name, Float weight, Float height) {
	    super(id, name, weight, height);
	 }

	@Override
	public void move() {
		this.walk();
	}
	
	
	@Override
	public void eat(Eatable eatable) {
		// TODO Auto-generated method stub
		if(eatable instanceof Animal) {
			System.out.println("Your caribou, just named: " + this.getName() + "cannot eat viande");
		}
		else if (eatable instanceof Vegetable){
			System.out.println("Your caribou, just named: " + this.getName() + "Just eat herbe");
		}
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Your caribou, just move walking");
	}
	
	

}
