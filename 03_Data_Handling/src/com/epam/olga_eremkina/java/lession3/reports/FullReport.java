/**
 * 
 */
package com.epam.olga_eremkina.java.lession3.reports;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import com.epam.olga_eremkina.java.lession3.data.AddingStudentsAndCurriculums;
import com.epam.olga_eremkina.java.lession3.information.CourseCurriculum;
import com.epam.olga_eremkina.java.lession3.information.Students;
import com.epam.olga_eremkina.java.lession3.timing.StudyProgress;

/**
 * @author Olga_Eremkina
 *
 */
public class FullReport {

    private static final int THIRD_CHOISE = 3;
    private static final int SECOND_CHOISE = 2;
    private static final int FIRST_CHOICE = 1;
    private static final char HYPHEN = '-';
    private static final char SPACE = ' ';
    public static final int SMALL_INTERVAL = 2;
    public static final int ADD_INTERVAL = 20;
    public static final int INTERVAL = 10;
    public static final String RESULT = "result";
    public static final String DURATION = "duration";
    public static final String COURSE = "course";
    public static final String FINISH_CURRICULUM_DATE = "finishcurriculum";
    public static final String START_CURRICULUM_DATE = "startcurriculum";
    public static final String FINISH_WORK_TIME = "finishwork";
    public static final String START_WORK_TIME = "startwork";
    public static final String NEW_LINE = "\n";
    public static final String TOTAL_DURATION = "totalduration";
    public static final String CURRICULUM = "curriculum";
    public static final String STUDENT = "student";
    public static final String HOURS = "hours";
    public static final String DAYS = "days";
    public static final String TIME_TO = "timeto";
    public static final String TIME_LEFT = "timeleft";
    public static final String PASS_TIME = "passtime";
    public static final String FUTURE = "futuretime";
    public static final String NOT_COMPLETE = "notcomplete";
    public static final String COMPLETE = "complete";

    Calendar tempTime1 = new GregorianCalendar();
    Calendar tempTime2 = new GregorianCalendar();

    int workDay = StudyProgress.END_WORK_DAY - StudyProgress.START_WORK_DAY;
    int timeBetweenDates = 0;
    int days = 0;
    int hours = 0;
    int counter = 0;
    int intervalLeft = intervalLeft();
    int intervalRight = intervalRight();
    
    int regularInterval = intervalLeft + ADD_INTERVAL;
    int dashLineInterval = regularInterval + intervalRight + INTERVAL;

    StringBuilder sb = new StringBuilder();
    Formatter formatDataStudent = new Formatter(sb);

    String formatLine = "%-" + (regularInterval) + "s" + "%s\n";
    String formatTimeLine = "%-" + (regularInterval) + "s" + "%s:00\n";
    String formatCurriculumTimeLine = "%-" + (regularInterval) + "s" + "%tF" + " %<tR\n";
    String formatCourseLine = "%s." + "%-" + ((regularInterval) - 2) + "s" + "%s\n";
    String formatTimeLeftLine = "%" + "s " + "%" + SMALL_INTERVAL + "s" + "%" + SMALL_INTERVAL + "s " + "%s" + NEW_LINE;
    String formatResultLine = "%-" + (regularInterval) + "s" + "%s\n" + "%-" + (regularInterval)
	    + "s";
    String formatDashLine = "%" + (dashLineInterval) + "s" + NEW_LINE;
    
    
    public void ShowReport(Students[] students, ResourceBundle rb, Calendar currentDate) {

	for (Students studentsInformation : students) {

	    formatDataStudent.format(NEW_LINE);
	    formatDataStudent.format(formatLine, rb.getString(STUDENT), studentsInformation.getStudentName());
	    formatDataStudent.format(formatLine, rb.getString(CURRICULUM),
		    studentsInformation.getStudentCurriculum().getCurriculumName());
	    formatDataStudent.format(formatLine, rb.getString(TOTAL_DURATION),
		    studentsInformation.getStudentCurriculum().getTotalDuration());
	    formatDataStudent.format(formatTimeLine, rb.getString(START_WORK_TIME), StudyProgress.START_WORK_DAY);
	    formatDataStudent.format(formatTimeLine, rb.getString(FINISH_WORK_TIME), StudyProgress.END_WORK_DAY);
	    formatDataStudent.format(formatCurriculumTimeLine, rb.getString(START_CURRICULUM_DATE),
		    studentsInformation.getStartDateTime());
	    formatDataStudent.format(formatCurriculumTimeLine, rb.getString(FINISH_CURRICULUM_DATE),
		    studentsInformation.getFinishDateTime());
	    formatDataStudent.format(NEW_LINE);
	    formatDataStudent.format(formatLine, rb.getString(COURSE), rb.getString(DURATION));

	    formatDataStudent.format(String.format(formatDashLine, "").replace(SPACE, HYPHEN));

	    for (CourseCurriculum courseInformation : studentsInformation.getStudentCurriculum()
		    .getCourseCurriculum()) {
		counter++;
		formatDataStudent.format(formatCourseLine, counter, courseInformation.getCourseName(),
			courseInformation.getCourseDuration());
	    }
	    formatDataStudent.format(String.format(formatDashLine, "").replace(SPACE, HYPHEN));
	    counter = 0;
	    formatDataStudent.format(NEW_LINE);

	    switch (StudyProgress.checkComplete(studentsInformation, currentDate)) {
	    case FIRST_CHOICE:
		formatDataStudent.format(formatResultLine, rb.getString(RESULT), rb.getString(COMPLETE),
			rb.getString(PASS_TIME));
		tempTime1 = (Calendar) studentsInformation.getFinishDateTime().clone();
		tempTime2 = (Calendar) currentDate.clone();

		break;
	    case SECOND_CHOISE:

		tempTime1 = (Calendar) currentDate.clone();
		tempTime2 = (Calendar) studentsInformation.getFinishDateTime().clone();

		formatDataStudent.format(formatResultLine, rb.getString(RESULT), rb.getString(NOT_COMPLETE),
			rb.getString(TIME_LEFT));
		break;
	    case THIRD_CHOISE:
		formatDataStudent.format(formatResultLine, rb.getString(RESULT), rb.getString(FUTURE),
			rb.getString(TIME_TO));
		tempTime1 = (Calendar) currentDate.clone();
		tempTime2 = (Calendar) studentsInformation.getStartDateTime().clone();
		break;
	    }

	    timeBetweenDates = StudyProgress.TimeBetweenDates(tempTime1, tempTime2);
	    days = timeBetweenDates / workDay;
	    hours = timeBetweenDates % workDay;
	    formatDataStudent.format(formatTimeLeftLine, days, rb.getString(DAYS), hours, rb.getString(HOURS));
	    formatDataStudent.format(String.format(formatDashLine, "").replace(SPACE, HYPHEN));
	    formatDataStudent.format(NEW_LINE);
	}

	System.out.println(sb);
	sb.setLength(0);
	formatDataStudent.close();

    }

    private static int intervalLeft() {
	int interval = 0;
	for (String courseInformation : AddingStudentsAndCurriculums.courseTitle) {

	    if (courseInformation.length() > interval)
		interval = courseInformation.length();
	}
	return interval;
    }
    
    private static int intervalRight() {
	int interval = 0;
	for (String courseInformation : AddingStudentsAndCurriculums.cirriculumAndNameTitle) {

	    if (courseInformation.length() > interval)
		interval = courseInformation.length();
	}
	return interval;
    }
}
