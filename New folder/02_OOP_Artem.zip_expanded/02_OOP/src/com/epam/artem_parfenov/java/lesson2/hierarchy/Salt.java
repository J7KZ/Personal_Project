package com.epam.artem_parfenov.java.lesson2.hierarchy;

import com.epam.artem_parfenov.java.lesson2.productcolorenam.Color;

public class Salt extends Product {

	private static final double SALT_CALORICITY = 0.0;
	private static final double SALT_PROTEIN = 0.0;
	private static final double SALT_FAT = 0.0;
	private static final double SALT_CARBOHYDRATE = 0.0;
	private static final double SALT_PINCH_GRAMS_AMOUNT = 4;

	private int saltPinchAmount;

	public Salt(Color color, int saltPinchAmount) {
		super(color);
		this.setCaloricity(SALT_CALORICITY);
		this.setProtein(SALT_PROTEIN);
		this.setFat(SALT_FAT);
		this.setCarbohydrate(SALT_CARBOHYDRATE);
		this.setSaltPinchAmount(saltPinchAmount);
	}

	public int getSaltPinchAmount() {

		return saltPinchAmount;
	}

	public void setSaltPinchAmount(int saltPinchAmount) {

		this.saltPinchAmount = saltPinchAmount;
	}

	@Override
	public double calculateRealWeight() {

		return this.saltPinchAmount * SALT_PINCH_GRAMS_AMOUNT;
	}
}