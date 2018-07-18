package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.onion;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Leek extends OnionVegetable {
	public Leek(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.OnionCalories.LEEK_CALORIES);
		setWeight(weight);
	}

	
}
