package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.vegetable.cabbage;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class WhiteCabbage extends CabbageVegetable {
	public WhiteCabbage(int weight) {
		setName(this);
		setCalories(Calories.Vegetable.CabbageCalories.WHITE_CABBAGE_CALORIES);
		setWeight(weight);
	}
}
