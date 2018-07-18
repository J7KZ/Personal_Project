package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.additional;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Cracker extends Additional {
	public Cracker(int weight) {
		setName(this);
		setCalories(Calories.Additional.CRACKER_CALORIES);
		setWeight(weight);
	}
}
