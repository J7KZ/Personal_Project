package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.root;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Radish extends RootVegetable {
	public Radish(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.RootCalories.RADISH_CALORIES);
		setWeight(weight);
	}

	
}
