package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.root;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Parsley extends RootVegetable {
	public Parsley(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.RootCalories.PARSLEY_CALORIES);
		setWeight(weight);
	}

	
}
