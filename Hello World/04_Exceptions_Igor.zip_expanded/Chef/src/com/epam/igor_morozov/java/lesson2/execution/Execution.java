package com.epam.igor_morozov.java.lesson2.execution;

import java.util.Formatter;

import com.epam.igor_morozov.java.lesson2.chef.Chef;
import com.epam.igor_morozov.java.lesson2.chef.ingridients.Ingredient;
import com.epam.igor_morozov.java.lesson2.chef.storage.in.used.Container;
import com.epam.igor_morozov.java.lesson2.chef.storage.search.Search;
import com.epam.igor_morozov.java.lesson2.chef.storage.search.parameter.SearchByCalories;
import com.epam.igor_morozov.java.lesson2.chef.storage.search.parameter.SearchByWeight;
import com.epam.igor_morozov.java.lesson2.chef.storage.sorting.Sorte;
import com.epam.igor_morozov.java.lesson2.data.DataSourse;
import com.epam.igor_morozov.java.lesson2.report.Report;
import com.epam.igor_morozov.java.lesson2.report.print.Messages;

public class Execution implements IExecution {

	private static final float SEARCH_PRICE_FROM = 2;
	private static final float SEARCH_PRICE_TO = 5;
	private static final float SEARCH_WEIGHT_FROM = 0;
	private static final float SEARCH_WEIGHT_TO = 20;
	private static float SEARCH_CALORIES_FROM = 124;
	private static float SEARCH_CALORIES_TO = 125f;

	Formatter formatter = new Formatter();
	Report report = new Report();
	Chef chef;
	Search searcher;
	Ingredient[] found;

	DataSourse input;
	private Container basket;
	private Container sauces;

	public Execution() {
		input = new DataSourse();
		validation();
		sauces = input.getSausage();
		chef = new Chef(basket, sauces);
		report.add(Messages.BASKET_MESSAGE, chef.getBasket().toString());

	}

	private void validation() {
		try {
			basket = input.getBasket();			
			if (basket.getIngredients().length == 0) {
				throw new IllegalStateException(Messages.NOT_VEGETABLES);
			}		
		}catch (IllegalStateException e) {			
			e.printStackTrace();
		//	System.exit(0);
		} 

	}

	@Override
	public void perform() {
		sort();
		makeSalad();
		search();
		calculateCaloric();
		print();

	}

	public void sort() {
		Sorte.sortByName(chef.getBasket());
		report.add(Messages.SORTING_BY_NAME, chef.getBasket().toString());

		Sorte.sortByCalories(chef.getBasket());
		report.add(Messages.SORTING_BY_CALORIES_MESSAGE, chef.getBasket().toString());

		Sorte.sorteByPrice(chef.getBasket());
		report.add(Messages.SORTING_BY_PRICE_MESSAGE, chef.getBasket().toString());

		Sorte.sorteByWeight(chef.getBasket());
		report.add(Messages.SORTING_BY_WEIGHT_MESSAGE, chef.getBasket().toString());

	}

	public void makeSalad() {
		
		chef.makeSalad();
		if(chef.getBowl().getIngredients().length!=0) {
			report.add(Messages.MADE_SALAD_MESSAGE);
		} else {
			report.add(Messages.NOT_COOKED_MESSAGE);
		}
		
	}

	public void search() {
		report.add(Messages.BOWL_MESSAGE, chef.getBowl().toString());
		searchByCalories();
		searchByPrice();
		searchByWeight();

	}

	public void print() {
		report.print();
	}

	public void calculateCaloric() {
		report.add(Messages.TOTAL_CALORIES_MESSAGE, chef.getBowl().getTotalCaloricValue());

	}

	private void searchByPrice() {
		report.add(Messages.SEARCH_BY_PRICE_MESSAGE + Messages.FROM_TO_MESSAGE, SEARCH_PRICE_FROM, SEARCH_PRICE_TO);

		searcher = new SearchByCalories(chef.getBowl().getIngredients());
		found = searcher.search(SEARCH_CALORIES_FROM, SEARCH_CALORIES_TO);

		for (Ingredient ingredient : found) {
			report.add(ingredient.toString());
		}
		if (found.length == 0) {
			report.add(Messages.NOTHING_FOUND);
		}
		report.add(Messages.NEXT_LINE);

	}

	private void searchByWeight() {
		report.add(Messages.SEARCH_BY_WEIGHT_MESSAGE + Messages.FROM_TO_MESSAGE, SEARCH_WEIGHT_FROM, SEARCH_WEIGHT_TO);

		searcher = new SearchByWeight(chef.getBowl().getIngredients());
		found = searcher.search(SEARCH_WEIGHT_FROM, SEARCH_WEIGHT_TO);

		for (Ingredient ingredient : found) {
			report.add(ingredient.toString());
		}
		if (found.length == 0) {
			report.add(Messages.NOTHING_FOUND);
		}
		report.add(Messages.NEXT_LINE);

	}

	private void searchByCalories() {
		report.add(Messages.SEARCH_BY_CALORIES_MESSAGE + Messages.FROM_TO_MESSAGE, SEARCH_CALORIES_FROM,
				SEARCH_CALORIES_TO);

		searcher = new SearchByCalories(chef.getBowl().getIngredients());
		found = searcher.search(SEARCH_CALORIES_FROM, SEARCH_CALORIES_TO);

		for (Ingredient ingredient : found) {
			report.add(ingredient.toString());
		}
		if (found.length == 0) {
			report.add(Messages.NOTHING_FOUND);
		}
		report.add(Messages.NEXT_LINE);
	}

}
