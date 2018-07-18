package com.epam.artem_parfenov.java.lesson2.hierarchy;

import com.epam.artem_parfenov.java.lesson2.productcolorenam.Color;

public class Cucumber extends Vegetable {

	private static final double CUCUMBER_CALORICITY = 14.0;
	private static final double CUCMBER_PROTEIN = 0.8;
	private static final double CUCUMBER_FAT = 0.1;
	private static final double CUCUMBER_CARBOHYDRATE = 2.6;
	private static final double CUCUMBER_TIP_MASS_FRACTION = 0.1;
	private static final int CUCUMBER_TIP_AMOUNT = 2;

	public Cucumber(Color color, double weight) {

		super(color, weight);
		this.setCaloricity(CUCUMBER_CALORICITY);
		this.setProtein(CUCMBER_PROTEIN);
		this.setFat(CUCUMBER_FAT);
		this.setCarbohydrate(CUCUMBER_CARBOHYDRATE);
	}

	@Override
	public double calculateRealWeight() {

		return this.getWeight() - CUCUMBER_TIP_AMOUNT * (this.getWeight() * CUCUMBER_TIP_MASS_FRACTION);
	}
}