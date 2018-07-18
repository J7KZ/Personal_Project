package com.epam.sergey_kuznetsov.java.lesson2.task2;

import java.util.ArrayList;

import com.epam.sergey_kuznetsov.java.lesson2.task2.ingridient.Ingredient;
import com.epam.sergey_kuznetsov.java.lesson2.task2.printer.Printer;
import com.epam.sergey_kuznetsov.java.lesson2.task2.recipes.VinaigretteRecipe;
import com.epam.sergey_kuznetsov.java.lesson2.task2.salad.Salad;
import com.epam.sergey_kuznetsov.java.lesson2.task2.search.Search;
import com.epam.sergey_kuznetsov.java.lesson2.task2.sort.Sort;

public class Service {
	public static final String SORTED_BY_NAME_MESSAGE = "Sorted by name: ";
	public static final String SORTED_BY_CALORIES_MESSAGE = "Sorted by calories: ";
	public static final String SORTED_BY_WEIGHT_MESSAGE = "Sorted by weight: ";
	public static final String SEARCH_BY_CALORIES_MESSAGE = "Result of seaching by calories: ";
	public static final String SEARCH_BY_WEIGHT_MESSAGE = "Result of searching by weight: ";

	public static void run() {
		Salad salad = new Salad();
		salad.createSalad(new VinaigretteRecipe());
		Printer printer = new Printer();
		printer.getInfo(salad);
		sorting(salad);
		searching(salad);
	}

	private static void sorting(Salad salad) {
		Printer printer = new Printer();
		Sort.sortByName(salad);
		printer.printMessage(SORTED_BY_NAME_MESSAGE);
		printer.getInfo(salad);
		Sort.sortByCalories(salad);
		printer.printMessage(SORTED_BY_CALORIES_MESSAGE);
		printer.getInfo(salad);
		Sort.sortByWeight(salad);
		printer.printMessage(SORTED_BY_WEIGHT_MESSAGE);
		printer.getInfo(salad);
	}

	private static void searching(Salad salad) {
		int fromExample = 50;
		int toExample = 700;

		Printer printer = new Printer();
		ArrayList<Ingredient> resultOfSearching = new ArrayList<Ingredient>();
		resultOfSearching = Search.searchByCalories(salad, fromExample, toExample);
		printer.printMessage(SEARCH_BY_CALORIES_MESSAGE + fromExample + " between " + toExample);
		printer.getInfo(resultOfSearching);

		fromExample = 150;
		toExample = 250;

		resultOfSearching = new ArrayList<Ingredient>();
		resultOfSearching = Search.searchByWeight(salad, fromExample, toExample);
		printer.printMessage(SEARCH_BY_WEIGHT_MESSAGE + fromExample + " between " + toExample);
		printer.getInfo(resultOfSearching);

	}

}
