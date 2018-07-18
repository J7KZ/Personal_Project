package com.epam.artem_parfenov.java.lesson2.hierarchy;

import com.epam.artem_parfenov.java.lesson2.productcolorenam.Color;

public class Onion extends Vegetable {

	private static final double ONION_CALORICITY = 41.0;
	private static final double ONION_PROTEIN = 1.4;
	private static final double ONION_FAT = 0.0;
	private static final double ONION_CARBOHYDRATE = 9.1;
	private static final double ONION_UPPER_LAYER_MASS_FRACTION = 0.08;
	private static final double ONION_TIP_MASS_FRACTION = 0.05;

	public Onion(Color color, double weight) {

		super(color, weight);
		this.setCaloricity(ONION_CALORICITY);
		this.setProtein(ONION_PROTEIN);
		this.setFat(ONION_FAT);
		this.setCarbohydrate(ONION_CARBOHYDRATE);

	}

	@Override
	public double calculateRealWeight() {

		return this.getWeight() - this.getWeight() * ONION_UPPER_LAYER_MASS_FRACTION
				- this.getWeight() * ONION_TIP_MASS_FRACTION;
	}
}