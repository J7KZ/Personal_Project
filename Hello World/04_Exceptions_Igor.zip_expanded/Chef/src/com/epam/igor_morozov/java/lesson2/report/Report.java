package com.epam.igor_morozov.java.lesson2.report;

import java.util.Formatter;

import com.epam.igor_morozov.java.lesson2.report.print.IPrint;
import com.epam.igor_morozov.java.lesson2.report.print.used.Printer;

public class Report implements IReport {

	private static final String NEW_LINE = "\n";
	Formatter formatter = new Formatter();
	IPrint printer = new Printer();

	@Override
	public void add(String message, String data) {
		formatter.format(message, data);
	}

	@Override
	public void add(String message) {
		formatter.format(message + NEW_LINE);
	}

	@Override
	public void add(String message, float from, float to) {

		formatter.format(message, from, to);

	}

	@Override
	public String toString() {
		return formatter.toString();
	}

	@Override
	public void add(String message, float value) {
		formatter.format(message, value);

	}

	public void print() {
		printer.print(formatter.toString());

	}

}
