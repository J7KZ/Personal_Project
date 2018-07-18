package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.onion;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Garlic extends OnionVegetable {
	public Garlic(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.OnionCalories.GARLIC_CALORIES);
		setWeight(weight);
	}

	
}
