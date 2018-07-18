package com.epam.artem_parfenov.java.lesson5.runner;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import com.epam.artem_parfenov.java.lesson5.exceptions.WeightAmountException;
import com.epam.artem_parfenov.java.lesson5.hierarchy.Product;
import com.epam.artem_parfenov.java.lesson5.hierarchyhandler.Initializer;
import com.epam.artem_parfenov.java.lesson5.hierarchyhandler.ProductComparator;
import com.epam.artem_parfenov.java.lesson5.hierarchyhandler.ProductSearcher;
import com.epam.artem_parfenov.java.lesson5.hierarchyhandler.Salad;
import com.epam.artem_parfenov.java.lesson5.hierarchyhandler.SaladSerializer;

public class Runner {

	private static final String SRC = "src";
	private static final String FOLDER = "file";
	private static final String FILE_NAME = "serializationfile.txt";
	private static final String CASES_CHOICE = "Choose one of the cases:";
	private static final String SALAD_DESERIALIZATION = "Enter 1 to deserialize the prepared salad";
	private static final String SALAD_PREPARING = "Enter 2 to prepare a salad yourself";
	private static final String INPUT_STRING_FORMAT = "%s%s%s%s%s";
	private static final String SUCCESSFUL_DESERIALIZATION = "Deserialization was successful!";
	private static final String NOT_SUCCESSFUL_DESERIALIZATION = "Deserialization wasn't successful!";
	private static final String SALAD_SERIALIZATION_CHOICE = "Do you want to serialise your salad?";
	private static final String YES = "Yes - 1";
	private static final String NO = "No - 2";
	private static final String INCORRECT_CASE = "You have entered the incorrect case!";
	private static final String DOUBLE_N_FORMAT = "%n%n";
	private static final String SERIALIZATION_REFUSING = "You have refused to serialize your salad.";
	private static final String SALT_PINCH_AMOUNT = "Enter the amount of pinch of salt:";
	private static final String SUNFLOWER_OIL_TABLESPOONS_AMOUNT = "Enter the amount of tablespoons of sunflower oil:";
	private static final String ONION_WEIGHT = "Enter the weight of the onion:";
	private static final String OMATO_WEIGHT = "Enter the weight of the tomato:";
	private static final String SECOND_CUCUMBER_WEIGHT = "Enter the weight of the second cucumber:";
	private static final String FIRST_CUCUMBER_WEIGHT = "Enter the weight of the first cucumber:";
	private static final int ARRAY_ELEMENTS_AMOUNT = 6;
	private static final String NEXT_LINE = "\n";
	private static final String PREPARED_SALAD = "You have prepared a salad:";
	private static final String SALAD_CALORICITY = "Caloricity of the salad:";
	private static final String SORTED_PRODUCTS = "Products in the salad that was sorted by caloricity (calculated by the weight):";
	private static final String SEARCHED_PRODUCTS = "Products in the salad that match the search parameters:";
	private static final double SEARCH_MIN_PROTEIN_VALUE = 0.0;
	private static final double SEARCH_MAX_PROTEIN_VALUE = 1.3;

	public static void main(String[] args) {

		Runner runner = new Runner();
		try {
			runner.startRunner();
		} catch (WeightAmountException e) {

			e.printStackTrace();
		}
	}

	public void startRunner() throws WeightAmountException {

		Scanner scanner = new Scanner(System.in);

		StringBuilder result = new StringBuilder();
		Product[] products = new Product[ARRAY_ELEMENTS_AMOUNT];
		Salad salad = null;
		File file = new File(SRC + File.separator + FOLDER + File.separator + FILE_NAME);

		System.out.println(String.format(INPUT_STRING_FORMAT, CASES_CHOICE, NEXT_LINE, SALAD_DESERIALIZATION, NEXT_LINE,
				SALAD_PREPARING));

		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			salad = SaladSerializer.deserializeSalad(salad, file);

			if (salad != null) {

				result.append(SUCCESSFUL_DESERIALIZATION).append(String.format(DOUBLE_N_FORMAT)).append(salad)
						.append(NEXT_LINE);
			} else {

				result.append(NOT_SUCCESSFUL_DESERIALIZATION);
			}
			break;
		case 2:
			salad = createNewSalad(result, scanner, products, salad);
			break;
		default:
			result.append(INCORRECT_CASE);
			break;
		}

	System.out
		.println(String.format(INPUT_STRING_FORMAT, SALAD_SERIALIZATION_CHOICE, NEXT_LINE, YES, NEXT_LINE, NO));

		int serializationChoice = scanner.nextInt();

		switch (serializationChoice) {
		case 1:
			result.append(SaladSerializer.serializeSalad(salad, file));
			break;
		case 2:
			result.append(SERIALIZATION_REFUSING);
			break;
		default:
			result.append(INCORRECT_CASE);
		}

		scanner.close();
		System.out.println(result);

	}

	private static Salad createNewSalad(StringBuilder result, Scanner scanner, Product[] products, Salad salad)
			throws WeightAmountException {

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

		products = Initializer.initialize(firstCucumberWeight, secondCucumberWeight, tomatoWeight, onionWeight,
				sunflowerOilTablespoonsAmount, saltPinchAmount);

		ProductComparator comparator = new ProductComparator();
		salad = new Salad(products);

		result.append(PREPARED_SALAD).append(NEXT_LINE).append(salad).append(NEXT_LINE).append(SALAD_CALORICITY)
				.append(NEXT_LINE).append(salad.getSaladCaloricity()).append(NEXT_LINE).append(NEXT_LINE);

		Arrays.sort(salad.getProducts(), comparator);

		result.append(SORTED_PRODUCTS).append(NEXT_LINE).append(salad).append(NEXT_LINE).append(SEARCHED_PRODUCTS)
				.append(NEXT_LINE).append(ProductSearcher.findProductsByProteinParametersRange(salad,
						SEARCH_MIN_PROTEIN_VALUE, SEARCH_MAX_PROTEIN_VALUE))
				.append(NEXT_LINE);

		return salad;
	}
}