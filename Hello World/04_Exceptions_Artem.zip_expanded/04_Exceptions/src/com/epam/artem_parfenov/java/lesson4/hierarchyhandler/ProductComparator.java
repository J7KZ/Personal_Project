package com.epam.artem_parfenov.java.lesson4.hierarchyhandler;

import java.util.Comparator;

import com.epam.artem_parfenov.java.lesson4.hierarchy.Product;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {

		return product1.compareTo(product2);
	}
}