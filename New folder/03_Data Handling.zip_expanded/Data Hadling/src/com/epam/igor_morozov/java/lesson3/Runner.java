package com.epam.igor_morozov.java.lesson3;

import java.util.Locale;
import com.epam.igor_morozov.java.lesson3.education.EducationCenter;

public class Runner {

	EducationCenter ec;
	boolean Short = false;
	private final String RUS_LENGUAGE = "ru";
	private final String RUS_COUNTRY = "RU";

	public static void main(String[] args) {

		Runner runner = new Runner();
		runner.startApplication(args);

	}

	/*
	 * Используется 2 строки Первая для вида отчета: 0 или пустота короткий отчет, в
	 * остальном случае полный Если во втором агрументе есть символы, отчет будет
	 * выведен на русском языке, если второго аргумента нет, выведется на
	 * английском.
	 * 
	 */
	private void startApplication(String[] args) {

		setTypeReport(args);
		setLocale(args);

		ec = new EducationCenter();
		ec.displayReport(Short);

	}

	private void setLocale(String[] args) {
		if (args.length > 1) {
			Locale.setDefault(new Locale(RUS_LENGUAGE, RUS_COUNTRY));
		} else {
			Locale.setDefault(Locale.US);
		}

	}

	private void setTypeReport(String[] args) {
		if (args.length == 0) {

			Short = true;

		} else if (args[0].contains("0")) {

			Short = true;

		}

	}

}
