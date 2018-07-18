package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Cheese extends Additional {
	public Cheese(int weight) {
		setName(this);
		setCalories(Calories.Additional.CHEESE_CALORIES);
		setWeight(weight);
	}

}
