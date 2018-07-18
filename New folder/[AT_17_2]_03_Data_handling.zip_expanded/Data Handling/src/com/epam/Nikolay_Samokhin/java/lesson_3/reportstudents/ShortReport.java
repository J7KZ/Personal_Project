package com.epam.Nikolay_Samokhin.java.lesson_3.reportstudents;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent.Students;
import com.epam.Nikolay_Samokhin.java.lesson_3.processingtimestudent.ProcessingTimeStudy;

public class ShortReport {

    public static final int MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS = 11;
    public static final int MIN_LINE_INTERVAL = 32;
    public static final int INTERVAL_BEETWEEN_WORDS_TIME = 50;
    public static final int INTERVAL_DATE = 4;
    public static final int INTERVAL_BEETWEEN_WORDS_COURSES = 50;
    public final static String TIME_PASSED = "timepassed";
    public final static String NOT_COMPLETE = "notcomplete";
    public final static String TIME_REMAIND = "timeremaind";
    public final static String DAYS = "days";
    public final static String HOURS = "hours";
    public final static String COMPLETE = "complete";
    Calendar buffTime1 = new GregorianCalendar();
    Calendar buffTime2 = new GregorianCalendar();
    int days = 0;
    int hours = 0;
    int beetweenHoursDate = 0;
    int timeAllWorkDayStudy = 0;

    StringBuilder sb = new StringBuilder();
    Formatter formatDataStudent = new Formatter(sb);

    String formatLine = "%-" + MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS + "s" + "(%s)";

    String formatLineComplete = " - %-" + (MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS) + "s" + "%-"
	    + MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS + "s";

    String formatLineCompleteTime = "%" + "s" + "%-" + INTERVAL_DATE + "s" + "%" + INTERVAL_DATE + "s" + "%s" + "\n";

    public void showReport(Students[] students, ResourceBundle resourceB, Calendar currentTime) {

	for (Students informationOfStudents : students) {
	    formatDataStudent.format(formatLine, informationOfStudents.getNameStudent(),
		    informationOfStudents.getCurriculumStudend().getNameCurriculum());

	    if (ProcessingTimeStudy.checkCompleteCurriculum(informationOfStudents, currentTime)) {
		buffTime1 = (Calendar) informationOfStudents.getEndDateTime().clone();
		buffTime2 = (Calendar) currentTime.clone();

		formatDataStudent.format(formatLineComplete, resourceB.getString(COMPLETE),
			resourceB.getString(TIME_PASSED));
	    } else {
		buffTime1 = (Calendar) currentTime.clone();
		buffTime2 = (Calendar) informationOfStudents.getEndDateTime().clone();
		formatDataStudent.format(formatLineComplete, resourceB.getString(NOT_COMPLETE),
			resourceB.getString(TIME_REMAIND));
	    }

	    /* Calculate the difference between dates */
	    beetweenHoursDate = ProcessingTimeStudy.TimeBeetweenDates(buffTime1, buffTime2);
	    /* Calculate the length of the working */
	    timeAllWorkDayStudy = ProcessingTimeStudy.END_WORK_DAY_STUDY - ProcessingTimeStudy.START_WORK_DAY_STUDY;
	    days = beetweenHoursDate / timeAllWorkDayStudy;// Calculate amount work day
	    /* Calculate the remainder of the working time */
	    hours = beetweenHoursDate
		    % (ProcessingTimeStudy.END_WORK_DAY_STUDY - ProcessingTimeStudy.START_WORK_DAY_STUDY);

	    formatDataStudent.format(formatLineCompleteTime, resourceB.getString(DAYS), days,
		    resourceB.getString(HOURS), hours);
	}

	System.out.println(sb);
	sb.setLength(0);
	formatDataStudent.close();
    }

}
