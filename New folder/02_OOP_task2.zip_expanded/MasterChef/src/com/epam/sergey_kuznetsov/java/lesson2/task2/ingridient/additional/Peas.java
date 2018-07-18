package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Peas extends Additional {
	public Peas(int weight) {
		setName(this);
		setCalories(Calories.Additional.EGG_CALORIES);
		setWeight(weight);
	}
}
