package com.epam.artem_parfenov.java.lesson5.hierarchy;

import java.io.Serializable;

import com.epam.artem_parfenov.java.lesson5.exceptions.WeightAmountException;
import com.epam.artem_parfenov.java.lesson5.interfaces.Weighable;
import com.epam.artem_parfenov.java.lesson5.productcolorenam.Color;

public abstract class Product implements Weighable, Comparable<Product>, Serializable {

	private static final long serialVersionUID = 1L;
	private static final String PRODUCT = "Product: ";
	private static final int PRODUCT_TITLE_OPENING_CHARACTER = 47;
	private static final String CALORICITY_100_GRAMS = "\n [caloricity (100 g.) = ";
	private static final String CALORICITY_BY_WEIGHT = ", calorycity (calculated by the weight) = ";
	private static final String PROTEIN_100_GRAMS = ", protein (100 g.) = ";
	private static final String FAT_100_GRAMS = ", fat (100 g.) = ";
	private static final String CARBOHYDRATE_100_GRAMS = ", carbohydrate (100 g.) = ";
	private static final String COLOR = ", color = ";
	private static final int GRAMS_AMOUNT_FOR_CALORICITY = 100;

	private double caloricity;
	private double protein;
	private double fat;
	private double carbohydrate;
	private Color color;

	public Product(Color color) throws WeightAmountException {

		this.setColor(color);
	}

	public double getCaloricity() {

		return caloricity;
	}

	protected void setCaloricity(double caloricity) {

		this.caloricity = caloricity;
	}

	public double getProtein() {

		return protein;
	}

	protected void setProtein(double protein) {

		this.protein = protein;
	}

	public double getFat() {

		return fat;
	}

	protected void setFat(double fat) {

		this.fat = fat;
	}

	public double getCarbohydrate() {

		return carbohydrate;
	}

	protected void setCarbohydrate(double carbohydrate) {

		this.carbohydrate = carbohydrate;
	}

	public Color getColor() {

		return color;
	}

	public void setColor(Color color) {

		this.color = color;
	}

	public double calculateCaloricityByWeight(double weight, double caloricity) {

		return weight * caloricity / GRAMS_AMOUNT_FOR_CALORICITY;
	}

	@Override
	public abstract double calculateRealWeight();

	@Override
	public int compareTo(Product o) {

		return (int) (this.calculateCaloricityByWeight(this.calculateRealWeight(), this.getCaloricity())
				- o.calculateCaloricityByWeight(o.calculateRealWeight(), o.getCaloricity()));
	}

	@Override
	public String toString() {

		return PRODUCT + this.getClass().getName().substring(PRODUCT_TITLE_OPENING_CHARACTER) + CALORICITY_100_GRAMS
				+ caloricity + CALORICITY_BY_WEIGHT
				+ this.calculateCaloricityByWeight(this.calculateRealWeight(), caloricity) + PROTEIN_100_GRAMS + protein
				+ FAT_100_GRAMS + fat + CARBOHYDRATE_100_GRAMS + carbohydrate + COLOR + color.toString().toLowerCase()
				+ "]";
	}
}