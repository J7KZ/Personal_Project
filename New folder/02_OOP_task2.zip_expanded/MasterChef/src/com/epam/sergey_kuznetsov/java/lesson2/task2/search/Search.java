package com.epam.sergey_kuznetsov.java.lesson2.task2.search;

import java.util.ArrayList;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;
import com.epam.sergey_kuznetsov.java.lesson2.task2.salad.Salad;

public class Search {

	

	public static ArrayList<Ingredient> searchByCalories(Salad salad, int from, int to) {
		return SearchByCalories.getSearchResults(salad, from, to);
	}

	public static ArrayList<Ingredient> searchByWeight(Salad salad, int from, int to) {
		return SearchByWeight.getSearchResults(salad, from, to);
	}

}
