package com.epam.artem_parfenov.java.lesson2.hierarchyhandler;

import com.epam.artem_parfenov.java.lesson2.hierarchy.Product;

public class ProductSearcher {

	private static final double MIN_CALORICITY_VALUE = 0.0;
	private static final double MAX_CALORICITY_VALUE = 45.0;
	private static final double MIN_PROTEIN_VALUE = 0.0;
	private static final double MAX_PROTEIN_VALUE = 1.5;
	private static final double MIN_FAT_VALUE = 0.0;
	private static final double MAX_FAT_VALUE = 0.5;
	private static final double MIN_CARBOHYDRATE_VALUE = 0.0;
	private static final double MAX_CARBOHYDRATE_VALUE = 4.0;
	private static final String NEXT_LINE = "\n";

	public static StringBuilder findProductsByParametersRange(Salad salad) {

		StringBuilder result = new StringBuilder();

		for (Product product : salad.getProducts()) {

			if (((product.getCaloricity() >= MIN_CALORICITY_VALUE) && (product.getCaloricity() <= MAX_CALORICITY_VALUE))
					&& ((product.getProtein() >= MIN_PROTEIN_VALUE) && (product.getProtein() <= MAX_PROTEIN_VALUE))
					&& ((product.getFat() >= MIN_FAT_VALUE) && (product.getFat() <= MAX_FAT_VALUE))
					&& ((product.getCarbohydrate() >= MIN_CARBOHYDRATE_VALUE)
							&& (product.getCarbohydrate() <= MAX_CARBOHYDRATE_VALUE))) {

				result.append(product.toString()).append(NEXT_LINE);
			}
		}

		return result;
	}
}