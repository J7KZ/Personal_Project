package com.epam.artem_parfenov.java.lesson4.runner;

import java.util.Arrays;
import java.util.Scanner;

import com.epam.artem_parfenov.java.lesson4.exceptions.WeightAmountException;
import com.epam.artem_parfenov.java.lesson4.hierarchy.Product;
import com.epam.artem_parfenov.java.lesson4.hierarchyhandler.Initializer;
import com.epam.artem_parfenov.java.lesson4.hierarchyhandler.ProductComparator;
import com.epam.artem_parfenov.java.lesson4.hierarchyhandler.ProductSearcher;
import com.epam.artem_parfenov.java.lesson4.hierarchyhandler.Salad;

public class Runner {

	private static final String SALT_PINCH_AMOUNT = "Enter the amount of pinch of salt:";
	private static final String SUNFLOWER_OIL_TABLESPOONS_AMOUNT = "Enter the amount of tablespoons of sunflower oil:";
	private static final String ONION_WEIGHT = "Enter the weight of the onion:";
	private static final String OMATO_WEIGHT = "Enter the weight of the tomato:";
	private static final String SECOND_CUCUMBER_WEIGHT = "Enter the weight of the second cucumber:";
	private static final String FIRST_CUCUMBER_WEIGHT = "Enter the weight of the first cucumber:";
	private static final int ARRAY_ELEMENTS_AMOUNT = 6;
	private static final String NEXT_LINE = "\n";
	private static final String PREPARED_SALAD = "We have prepared a salad:";
	private static final String SALAD_CALORICITY = "Caloricity of the salad:";
	private static final String SORTED_PRODUCTS = "Products in the salad that was sorted by caloricity (calculated by the weight):";
	private static final String SEARCHED_PRODUCTS = "Products in the salad that match the search parameters:";
	private static final double SEARCH_MIN_PROTEIN_VALUE = 0.0;
	private static final double SEARCH_MAX_PROTEIN_VALUE = 1.3;

	public static void main(String[] args) {

		Runner runner = new Runner();
		runner.startRunner();
	}

	public void startRunner() {

		Scanner scanner = new Scanner(System.in);

		System.out.println(FIRST_CUCUMBER_WEIGHT);
		double firstCucumberWeight = scanner.nextDouble();
		System.out.println(SECOND_CUCUMBER_WEIGHT);
		double secondCucumberWeight = scanner.nextDouble();
		System.out.println(OMATO_WEIGHT);
		double tomatoWeight = scanner.nextDouble();
		System.out.println(ONION_WEIGHT);
		double onionWeight = scanner.nextDouble();
		System.out.println(SUNFLOWER_OIL_TABLESPOONS_AMOUNT);
		int sunflowerOilTablespoonsAmount = scanner.nextInt();
		System.out.println(SALT_PINCH_AMOUNT);
		int saltPinchAmount = scanner.nextInt();
		scanner.close();

		StringBuilder result = new StringBuilder();
		Product[] products = new Product[ARRAY_ELEMENTS_AMOUNT];

		try {

			products = Initializer.initialize(firstCucumberWeight, secondCucumberWeight, tomatoWeight, onionWeight,
					sunflowerOilTablespoonsAmount, saltPinchAmount);

			ProductComparator comparator = new ProductComparator();
			Salad salad = new Salad(products);

			result.append(PREPARED_SALAD).append(NEXT_LINE).append(salad).append(NEXT_LINE).append(SALAD_CALORICITY)
					.append(NEXT_LINE).append(salad.getSaladCaloricity()).append(NEXT_LINE).append(NEXT_LINE);

			Arrays.sort(salad.getProducts(), comparator);

			result.append(SORTED_PRODUCTS).append(NEXT_LINE).append(salad).append(NEXT_LINE).append(SEARCHED_PRODUCTS)
					.append(NEXT_LINE).append(ProductSearcher.findProductsByProteinParametersRange(salad,
							SEARCH_MIN_PROTEIN_VALUE, SEARCH_MAX_PROTEIN_VALUE));

			System.out.println(result);
		} catch (WeightAmountException e) {

			System.err.println(e.toString());
		}
	}
}