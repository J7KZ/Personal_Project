package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.cabbage;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Broccoli extends CabbageVegetable {
	public Broccoli(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.CabbageCalories.BROCCOLI_CALORIES);
		setWeight(weight);
	}

	
}
