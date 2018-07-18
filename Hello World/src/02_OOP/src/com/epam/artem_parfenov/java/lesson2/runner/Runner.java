package com.epam.artem_parfenov.java.lesson2.runner;

import java.util.Arrays;

import com.epam.artem_parfenov.java.lesson2.hierarchy.Product;
import com.epam.artem_parfenov.java.lesson2.hierarchyhandler.Initializer;
import com.epam.artem_parfenov.java.lesson2.hierarchyhandler.ProductComparator;
import com.epam.artem_parfenov.java.lesson2.hierarchyhandler.ProductSearcher;
import com.epam.artem_parfenov.java.lesson2.hierarchyhandler.Salad;

public class Runner {

	private static final int ARRAY_ELEMENTS_AMOUNT = 6;
	private static final String NEXT_LINE = "\n";
	private static final String PREPARED_SALAD = "We have prepared a salad:";
	private static final String SALAD_CALORICITY = "Caloricity of the salad:";
	private static final String SORTED_PRODUCTS = "Products in the salad that was sorted by caloricity (calculated by the weight):";
	private static final String SEARCHED_PRODUCTS = "Products in the salad that match the search parameters:";

	public static void main(String[] args) {

		Runner runner = new Runner();
		runner.startRunner();
	}

	public void startRunner() {

		StringBuilder result = new StringBuilder();
		Product[] products = new Product[ARRAY_ELEMENTS_AMOUNT];
		products = Initializer.initialize();
		ProductComparator comparator = new ProductComparator();
		Salad salad = new Salad(products);

		result.append(PREPARED_SALAD).append(NEXT_LINE).append(salad).append(NEXT_LINE).append(SALAD_CALORICITY)
				.append(NEXT_LINE).append(salad.getSaladCaloricity()).append(NEXT_LINE).append(NEXT_LINE);

		Arrays.sort(salad.getProducts(), comparator);

		result.append(SORTED_PRODUCTS).append(NEXT_LINE).append(salad).append(NEXT_LINE).append(SEARCHED_PRODUCTS)
				.append(NEXT_LINE).append(ProductSearcher.findProductsByParametersRange(salad));

		System.out.println(result);
	}
}