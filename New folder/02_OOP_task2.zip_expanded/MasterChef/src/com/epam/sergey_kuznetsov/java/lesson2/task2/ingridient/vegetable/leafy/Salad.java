package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.leafy;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Salad extends LeafyVegetable {
	public Salad(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.LeafyCalories.SALAD_CALORIES);
		setWeight(weight);
	}

	
}
