package com.epam.igor_morozov.java.lesson2.report.print.used;

import com.epam.igor_morozov.java.lesson2.report.print.IPrint;

public class Printer implements IPrint {

	@Override
	public void print(String message) {
		System.out.println(message);

	}

}
