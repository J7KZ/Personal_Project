package com.epam.sergey_kuznetsov.java.lesson2.task2.search;

import java.util.ArrayList;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;
import com.epam.sergey_kuznetsov.java.lesson2.task2.salad.Salad;

class SearchByWeight {
	public static ArrayList<Ingredient> getSearchResults(Salad salad, int from, int to) {

		ArrayList<Ingredient> result = new ArrayList<Ingredient>();
		for (Ingredient i : salad.getIngridients()) {
			if (i.getWeight() >= from && i.getWeight() <= to) {
				result.add(i);
			}
		}
		return result;

	}
}
