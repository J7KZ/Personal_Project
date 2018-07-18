package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.onion;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Onion extends OnionVegetable {
	public Onion(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.OnionCalories.ONION_CALORIES);
		setWeight(weight);
	}

	
}
