package com.epam.Nikolay_Samokhin.java.lesson_3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

import com.epam.Nikolay_Samokhin.java.lesson_3.reportstudents.LongStudentsReport;
import com.epam.Nikolay_Samokhin.java.lesson_3.reportstudents.ShortReport;
import com.epam.Nikolay_Samokhin.java.lesson_3.source.CreatingCurriculumStudents;

/**
 * @author Samokhin Nikolay
 *  Lesson_3 Data Handling created by Samokhin_Nikolay
 * 
 */
public class Runner {
    public final static String ONE = "1";
    public final static String TWO = "2";
    public final static String THREE = "3";
    public final static String FOUR = "4";
    public final static int ZERO_DATE = 0;
	Locale rusLocale = new Locale("ru", "RU");
	Locale engLocale = new Locale("en", "ENG");
    public static void main(String[] args) {

	Runner.startApp(args[0]);

    }

    public static void startApp(String arg) {
	Calendar currentTime = new GregorianCalendar();
	Locale rusLocale = new Locale("ru", "RU");
	Locale engLocale = new Locale("en", "ENG");
	ShortReport runningShortReport = new ShortReport();
	LongStudentsReport runningLongStudentsReport = new LongStudentsReport();

	ResourceBundle resourceLongRU = ResourceBundle
		.getBundle("com.epam.Nikolay_Samokhin.java.lesson_3.reportstudents.ResourceStudentRU", rusLocale);
	ResourceBundle resourceShortRU = ResourceBundle
		.getBundle("com.epam.Nikolay_Samokhin.java.lesson_3.reportstudents.ResourceStudentShortRU", rusLocale);
	ResourceBundle resourceLongEN = ResourceBundle
		.getBundle("com.epam.Nikolay_Samokhin.java.lesson_3.reportstudents.ResourceStudentENG", engLocale);
	ResourceBundle resourceShortEN = ResourceBundle
		.getBundle("com.epam.Nikolay_Samokhin.java.lesson_3.reportstudents.ResourceStudentShortENG", engLocale);
	currentTime.add(Calendar.DATE, ZERO_DATE);

	
	switch (arg) {
	case ONE:
	    runningShortReport.showReport(CreatingCurriculumStudents.makeCurriculum(), resourceShortRU, currentTime);
	    break;
	case TWO:
	    runningLongStudentsReport.showStudentsLongReport(CreatingCurriculumStudents.makeCurriculum(),
		    resourceLongRU, currentTime);
	    break;
	case THREE:
	    runningShortReport.showReport(CreatingCurriculumStudents.makeCurriculum(), resourceShortEN, currentTime);
	    break;
	case FOUR:
	    runningLongStudentsReport.showStudentsLongReport(CreatingCurriculumStudents.makeCurriculum(),
		    resourceLongEN, currentTime);
	    break;
	}

    }

}
