package com.epam.artem_parfenov.java.lesson4.hierarchy;

import com.epam.artem_parfenov.java.lesson4.exceptions.WeightAmountException;
import com.epam.artem_parfenov.java.lesson4.productcolorenam.Color;

public class SunflowerOil extends Oil {

	private static final double SUNFLOWER_OIL_CALORICITY = 899.0;
	private static final double SUNFLOWER_OIL_PROTEIN = 0.0;
	private static final double SUNFLOWER_OIL_FAT = 99.9;
	private static final double SUNFLOWER_OIL_CARBOHYDRATE = 0.0;

	public SunflowerOil(Color color, int tablespoonsAmount) throws WeightAmountException {

		super(color, tablespoonsAmount);
		this.setCaloricity(SUNFLOWER_OIL_CALORICITY);
		this.setProtein(SUNFLOWER_OIL_PROTEIN);
		this.setFat(SUNFLOWER_OIL_FAT);
		this.setCarbohydrate(SUNFLOWER_OIL_CARBOHYDRATE);
	}

	@Override
	public double calculateRealWeight() {

		return this.getTablespoonsAmount() * this.getTablespoonGramsAmount() * this.getOilLiterGramsAmount()
				/ this.getConversionFactor();
	}
}