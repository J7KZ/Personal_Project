package com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.salad_dressing;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Calories;

public class Mayonnaise extends SaladDressing {
	public Mayonnaise(int weight) {
		setName(this);
		setCalories(Calories.SaladDressing.MAYONNAISE_CALORIES);
		setWeight(weight);
	}


	
}
