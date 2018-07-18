/**
 * 
 */
package com.epam.olga_eremkina.java.lession3.reports;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;


import com.epam.olga_eremkina.java.lession3.information.Students;
import com.epam.olga_eremkina.java.lession3.timing.StudyProgress;

/**
 * @author Olga_Eremkina
 *
 */
public class ShortReport {

    private static final int THIRD_CHOISE = 3;
    private static final int SECOND_CHOICE = 2;
    private static final int FIRST_CHOISE = 1;
    public static final String HOURS = "hours";
    public static final String DAYS = "days";
    public static final String TIME_TO = "timeto";
    public static final String TIME_LEFT = "timeleft";
    public static final String PASS_TIME = "passtime";
    public static final String FUTURE = "futuretime";
    public static final String NOT_COMPLETE = "notcomplete";
    public static final String COMPLETE = "complete";
    public static final int SMALL_INTERVAL = 2;
    public static final int ADD_INTERVAL = 12;

    Calendar tempTime1 = new GregorianCalendar();
    Calendar tempTime2 = new GregorianCalendar();

    int workDay = StudyProgress.END_WORK_DAY - StudyProgress.START_WORK_DAY;
    int timeBetweenDates = 0;
    int days = 0;
    int hours = 0;
    
    
    StringBuilder sb = new StringBuilder();
    Formatter formatDataStudent = new Formatter(sb);

    String formatNameLine = "%-"  + ADD_INTERVAL +"s" + "(%s)";
    String formatCompleteLine = " - %-" + ADD_INTERVAL + "s" + " %-"+ ADD_INTERVAL + "s ";
    String formatTimeLeftLine = " %" + "s " + "%" + SMALL_INTERVAL + "s" + "%" + SMALL_INTERVAL + "s " + "%s" + "\n" + "\n";

    public void ShowReport(Students[] students, ResourceBundle rb, Calendar currentDate) {
	for (Students studentsInformation : students) {
	    formatDataStudent.format(formatNameLine, studentsInformation.getStudentName(),
		    studentsInformation.getStudentCurriculum().getCurriculumName());

	    switch (StudyProgress.checkComplete(studentsInformation, currentDate)) {
	    case FIRST_CHOISE:
		formatDataStudent.format(formatCompleteLine, rb.getString(COMPLETE), rb.getString(PASS_TIME));
		tempTime1 = (Calendar) studentsInformation.getFinishDateTime().clone();
		tempTime2 = (Calendar) currentDate.clone();
		break;
	    case SECOND_CHOICE:

		tempTime1 = (Calendar) currentDate.clone();
		tempTime2 = (Calendar) studentsInformation.getFinishDateTime().clone();

		formatDataStudent.format(formatCompleteLine, rb.getString(NOT_COMPLETE), rb.getString(TIME_LEFT));
		break;
	    case THIRD_CHOISE:
		formatDataStudent.format(formatCompleteLine, rb.getString(FUTURE), rb.getString(TIME_TO));
		tempTime1 = (Calendar) currentDate.clone();
		tempTime2 = (Calendar) studentsInformation.getStartDateTime().clone();
		break;
	    }

	    timeBetweenDates = StudyProgress.TimeBetweenDates(tempTime1, tempTime2);
	    days = timeBetweenDates / workDay;
	    hours = timeBetweenDates % workDay;
	    formatDataStudent.format(formatTimeLeftLine, days, rb.getString(DAYS), hours, rb.getString(HOURS));
	}
	System.out.println(sb);
	sb.setLength(0);
	formatDataStudent.close();
    }

    
    
}
