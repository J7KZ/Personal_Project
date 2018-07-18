package com.epam.igor_morozov.java.lesson3.report;

import java.util.Locale;

import com.epam.igor_morozov.java.lesson3.education.student.Student;
import com.epam.igor_morozov.java.lesson3.report.messages.Messages;
import com.epam.igor_morozov.java.lesson3.report.print.Printable;
import com.epam.igor_morozov.java.lesson3.report.type.FullReport;
import com.epam.igor_morozov.java.lesson3.report.type.MakeReport;
import com.epam.igor_morozov.java.lesson3.report.type.ShortReport;

public class Report {

	private Student student;
	private String reportMessage;
	private Messages messages;
	private MakeReport report;

	public Report(Student student, boolean isShortly) {

		messages = new Messages(Locale.getDefault());
		this.student = student;
		extractInformation(isShortly);

	}

	private void extractInformation(boolean shortly) {
		if (shortly) {
			report = new ShortReport(messages, student);

		} else {
			report = new FullReport(messages, student);

		}
		reportMessage = report.makeReport();

	}

	public void print(Printable printer) {
		printer.print(reportMessage);

	}

}
