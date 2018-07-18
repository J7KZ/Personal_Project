package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.spice;


import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;

abstract class Spice extends Ingredient {
	
	public Spice(){
		setTypeOfIngridient(this);
	}
	
}
