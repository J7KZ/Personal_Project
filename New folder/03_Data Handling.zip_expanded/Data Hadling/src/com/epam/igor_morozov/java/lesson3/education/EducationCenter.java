package com.epam.igor_morozov.java.lesson3.education;

import com.epam.igor_morozov.java.lesson3.data.DataSource;
import com.epam.igor_morozov.java.lesson3.education.student.Student;
import com.epam.igor_morozov.java.lesson3.report.Report;
import com.epam.igor_morozov.java.lesson3.report.print.Printer;

public class EducationCenter {

	private Student[] students;
	private Printer printer;
	private Report report;
	private boolean isShortReport;
	private DataSource dataSource;

	public EducationCenter() {

		dataSource = new DataSource();
		students = dataSource.getStudent();
		printer = new Printer();
	}

	public void displayReport(boolean isShort) {

		isShortReport = isShort;

		for (Student student : students) {

			report = new Report(student, isShortReport);
			report.print(printer);

		}
	}

}
