package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.tuberous;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Potato extends TuberousVegetable  {
	private boolean boiled;
	public Potato(int weight) {
		setBoiled(false);
		setName(this);
		setCalories(Calories.Vegetable.TuberousCalories.POTATO_CALORIES);
		setWeight(weight);
	}

	

	public boolean isBoiled() {
		return boiled;
	}

	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}

	

	
}
