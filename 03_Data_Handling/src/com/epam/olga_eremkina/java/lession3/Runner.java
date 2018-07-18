/**
 * 
 */
package com.epam.olga_eremkina.java.lession3;

import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

import com.epam.olga_eremkina.java.lession3.data.AddingStudentsAndCurriculums;
import com.epam.olga_eremkina.java.lession3.reports.FullReport;
import com.epam.olga_eremkina.java.lession3.reports.ShortReport;

/**
 * @author Olga_Eremkina
 *
 */
public class Runner {

    public static final String FOUR = "4";
    public static final String THREE = "3";
    public static final String TWO = "2";
    public static final String ONE = "1";

    public static void main(String[] args) {
	Runner runner = new Runner();
	runner.startApplication(args[0]);
    }

    public void startApplication(String args) {
	Calendar currentDate = new GregorianCalendar();
	Locale rusLocale = new Locale("ru", "RU");
	Locale engLocale = new Locale("en", "EN");
	ShortReport runShortReport = new ShortReport();
	FullReport runFullReport = new FullReport();

	ResourceBundle reportShortRU = ResourceBundle
		.getBundle("com.epam.olga_eremkina.java.lession3.reports.Report_RU", rusLocale);

	ResourceBundle reportShortEN = ResourceBundle
		.getBundle("com.epam.olga_eremkina.java.lession3.reports.Report_EN", engLocale);

	ResourceBundle reportFullRU = ResourceBundle.getBundle("com.epam.olga_eremkina.java.lession3.reports.Report_RU",
		rusLocale);

	ResourceBundle reportFullEN = ResourceBundle.getBundle("com.epam.olga_eremkina.java.lession3.reports.Report_EN",
		engLocale);
	

	switch (args) {
	case ONE:
	    runShortReport.ShowReport(AddingStudentsAndCurriculums.createCurriculum(), reportShortRU, currentDate);
	    break;
	case TWO:
	    runFullReport.ShowReport(AddingStudentsAndCurriculums.createCurriculum(), reportFullRU, currentDate);
	    break;
	case THREE:
	    runShortReport.ShowReport(AddingStudentsAndCurriculums.createCurriculum(), reportShortEN, currentDate);
	    break;
	case FOUR:
	    runFullReport.ShowReport(AddingStudentsAndCurriculums.createCurriculum(), reportFullEN, currentDate);
	    break;
	default:
	    runShortReport.ShowReport(AddingStudentsAndCurriculums.createCurriculum(), reportShortRU, currentDate);

	}

    }
}
