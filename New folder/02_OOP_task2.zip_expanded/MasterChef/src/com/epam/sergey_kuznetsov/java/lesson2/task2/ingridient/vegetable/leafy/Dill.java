package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.leafy;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Dill extends LeafyVegetable {
	public Dill(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.LeafyCalories.DILL_CALORIES);
		setWeight(weight);
	}

	
}
