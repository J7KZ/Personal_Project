package com.epam.artem_parfenov.java.lesson5.hierarchyhandler;

import java.io.Serializable;

import com.epam.artem_parfenov.java.lesson5.hierarchy.Product;

public class Salad implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String NEXT_LINE = "\n";

	private Product[] products;

	public Salad(Product[] products) {

		this.products = products;
	}

	public Product[] getProducts() {

		return products;
	}

	public double getSaladCaloricity() {

		double saladCaloricity = 0;

		for (Product product : this.products) {

			saladCaloricity += product.calculateCaloricityByWeight(product.calculateRealWeight(),
					product.getCaloricity());
		}

		return saladCaloricity;
	}

	@Override
	public String toString() {

		String saladInformation = new String();

		for (Product product : this.products) {

			saladInformation += product.toString() + NEXT_LINE;
		}

		return saladInformation;
	}
}