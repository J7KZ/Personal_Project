package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.salad_dressing;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;

abstract class SaladDressing extends Ingredient {
	public SaladDressing() {
		setTypeOfIngridient(this);
	}
	
}
