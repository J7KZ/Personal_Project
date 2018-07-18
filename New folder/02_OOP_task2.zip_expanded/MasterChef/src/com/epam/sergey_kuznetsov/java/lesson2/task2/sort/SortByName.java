package com.epam.sergey_kuznetsov.java.lesson2.task2.sort;

import java.util.Comparator;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;

class SortByName implements Comparator<Ingredient> {

	@Override
	public int compare(Ingredient firstIngridient, Ingredient secondIngridient) {
		return firstIngridient.getName().compareTo(secondIngridient.getName());
	}

}
