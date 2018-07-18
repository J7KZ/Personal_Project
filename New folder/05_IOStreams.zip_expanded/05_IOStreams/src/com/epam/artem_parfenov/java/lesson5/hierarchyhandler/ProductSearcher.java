package com.epam.artem_parfenov.java.lesson5.hierarchyhandler;

import com.epam.artem_parfenov.java.lesson5.hierarchy.Product;

public class ProductSearcher {

	private static final String NEXT_LINE = "\n";

	public static StringBuilder findProductsByProteinParametersRange(Salad salad, double minProteinValue,
			double maxProteinValue) {

		StringBuilder result = new StringBuilder();

		for (Product product : salad.getProducts()) {

			if ((product.getProtein() >= minProteinValue) && (product.getProtein() <= maxProteinValue)) {

				result.append(product.toString()).append(NEXT_LINE);
			}
		}

		return result;
	}
}