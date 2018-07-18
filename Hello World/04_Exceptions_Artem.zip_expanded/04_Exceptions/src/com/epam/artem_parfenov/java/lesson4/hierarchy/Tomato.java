package com.epam.artem_parfenov.java.lesson4.hierarchy;

import com.epam.artem_parfenov.java.lesson4.exceptions.WeightAmountException;
import com.epam.artem_parfenov.java.lesson4.productcolorenam.Color;

public class Tomato extends Vegetable {

	private static final double TOMATO_CALORICITY = 23.0;
	private static final double TOMATO_PROTEIN = 1.1;
	private static final double TOMATO_FAT = 0.2;
	private static final double TOMATO_CARBOHYDRATE = 3.8;
	private static final double TOMATO_CORE_MASS_FRACTION = 0.2;

	public Tomato(Color color, double weight) throws WeightAmountException {

		super(color, weight);
		this.setCaloricity(TOMATO_CALORICITY);
		this.setProtein(TOMATO_PROTEIN);
		this.setFat(TOMATO_FAT);
		this.setCarbohydrate(TOMATO_CARBOHYDRATE);
	}

	@Override
	public double calculateRealWeight() {

		return this.getWeight() - this.getWeight() * TOMATO_CORE_MASS_FRACTION;
	}
}