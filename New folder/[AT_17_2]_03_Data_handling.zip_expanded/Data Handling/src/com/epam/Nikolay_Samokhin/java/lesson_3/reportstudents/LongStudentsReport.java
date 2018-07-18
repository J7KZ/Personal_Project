package com.epam.Nikolay_Samokhin.java.lesson_3.reportstudents;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent.CurriculumCourse;
import com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent.Students;
import com.epam.Nikolay_Samokhin.java.lesson_3.processingtimestudent.ProcessingTimeStudy;

public class LongStudentsReport {
    public static final int ZERO = 0;
    public static final int MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS = 50;
    public static final int MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS_COURSE = 67;
    public static final int MIN_INTERVAL_BEETWEEN_WORDS_S = 48;
    public static final int MIN_LINE_INTERVAL = 32;
    public static final int INTERVAL_BEETWEEN_WORDS_TIME = 50;
    public static final int INTERVAL_DATE = 4;
    public static final int INTERVAL_BEETWEEN_WORDS_COURSES = 50;
    public final static String CURRENT_TIME = "currenttime";
    public final static String NAME_STUDENT = "namestudent";
    public final static String START_DAY_WORK = "startdaywork";
    public final static String END_DAY_WORK = "enddaywork";
    public final static String NAME_CURRICULUM = "namecurriculum";
    public final static String DURATION_CURRICULUM = "durationprogramm";
    public final static String START_CURRICULUM = "startcurriculum";
    public final static String END_CURRICULUM = "endcurriculum";
    public final static String NAME_OF_COURSES = "nameofcourses";
    public final static String DURATION_COURSES = "durationcourses";
    public final static String STATUS_CURRICULUM = "statuscurriculum";
    public final static String COMPLETE = "complete";
    public final static String TIME_PASSED = "timepassed";
    public final static String NOT_COMPLETE = "notcomplete";
    public final static String TIME_REMAIND = "timeremaind";
    public final static String DAYS = "days";
    public final static String HOURS = "hours";
    public final static String DATE_FORMAT = "dd/yyyy/hh:mm";
    public final static String IDENTATION = "\n";
    public final static String COURSE = "course";

    Calendar buffTime1 = new GregorianCalendar();
    Calendar buffTime2 = new GregorianCalendar();
    int days = 0;
    int counter = 0;
    int hours = 0;
    int beetweenHours = 0;
    int timeAllWorkDay = 0;
    StringBuilder sb = new StringBuilder();
    Formatter formatDataStudent = new Formatter(sb);
    String courseLine = "%s" + "." + "%s";
    String courseLineDuration = "%s." + "%-" + MIN_INTERVAL_BEETWEEN_WORDS_S + "s" + "%-"
	    + MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS + "s" + "\n";
    String courseDurationLine = "%-" + (MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS) + "s" + "%s\n";
    String formatLine = "%-" + MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS + "s" + "%s\n";
    String formatLineComplete = "%-" + MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS + "s" + "%-"
	    + (MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS + INTERVAL_BEETWEEN_WORDS_COURSES) + "s\n" + "%-"
	    + MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS + "s";
    String formatLineTime = "%-" + INTERVAL_BEETWEEN_WORDS_TIME + "s" + "%s:00\n";
    String formatLineCourses = "%-" + (MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS + INTERVAL_BEETWEEN_WORDS_COURSES) + "s"
	    + "%s\n";
    String formatLineCompleteTime = "%" + "s" + "%-" + INTERVAL_DATE + "s" + "%" + INTERVAL_DATE + "s" + "%s" + "\n";

    public void showStudentsLongReport(Students[] students, ResourceBundle resourceB, Calendar currentTime) {

	int wideTableReport = getWideTableReport(students);
	String lineWideTable = getLineWide(wideTableReport);
	for (Students informationOfStudents : students) {
	    formatDataStudent.format(IDENTATION);
	    formatDataStudent.format(formatLine, resourceB.getString(NAME_STUDENT),informationOfStudents.getNameStudent());
	    formatDataStudent.format(formatLine, resourceB.getString(NAME_CURRICULUM),informationOfStudents.getCurriculumStudend().getNameCurriculum());
	    formatDataStudent.format(formatLine, resourceB.getString(DURATION_CURRICULUM),informationOfStudents.getCurriculumStudend().getSumDuration());
	    formatDataStudent.format(formatLineTime, resourceB.getString(START_DAY_WORK),ProcessingTimeStudy.START_WORK_DAY_STUDY);
	    formatDataStudent.format(formatLineTime, resourceB.getString(END_DAY_WORK),ProcessingTimeStudy.END_WORK_DAY_STUDY);
	    formatDataStudent.format(formatLine, resourceB.getString(START_CURRICULUM), getFormatCurrentTime(informationOfStudents.getStartDateTime()));
	    formatDataStudent.format(formatLine, resourceB.getString(END_CURRICULUM), getFormatCurrentTime(informationOfStudents.getEndDateTime()));
	    formatDataStudent.format(IDENTATION);
	    formatDataStudent.format(formatLine, resourceB.getString(COURSE), resourceB.getString(DURATION_COURSES));
	    formatDataStudent.format(lineWideTable + IDENTATION);

	    for (CurriculumCourse informationOfCourses : informationOfStudents.getCurriculumStudend()
		    .getCoursesCurriculum()) {
		counter++;
		formatDataStudent.format(courseLineDuration, counter, informationOfCourses.getNameCourse(),
			informationOfCourses.getDuration());

	    }
	    formatDataStudent.format(lineWideTable + IDENTATION);
	    counter = ZERO;// it is necessary that set to zero counter

	    if (ProcessingTimeStudy.checkCompleteCurriculum(informationOfStudents, currentTime)) {
		buffTime1 = (Calendar) informationOfStudents.getEndDateTime().clone();
		buffTime2 = (Calendar) currentTime.clone();

		formatDataStudent.format(formatLineComplete, resourceB.getString(STATUS_CURRICULUM),
			resourceB.getString(COMPLETE), resourceB.getString(TIME_PASSED));
	    } else {
		buffTime1 = (Calendar) currentTime.clone();
		buffTime2 = (Calendar) informationOfStudents.getEndDateTime().clone();
		formatDataStudent.format(formatLineComplete, resourceB.getString(STATUS_CURRICULUM),
			resourceB.getString(NOT_COMPLETE), resourceB.getString(TIME_REMAIND));
	    }

	    /* Calculate the difference between dates */
	    beetweenHours = ProcessingTimeStudy.TimeBeetweenDates(buffTime1, buffTime2);

	    /* Calculate the length of the working day */
	    timeAllWorkDay = ProcessingTimeStudy.END_WORK_DAY_STUDY - ProcessingTimeStudy.START_WORK_DAY_STUDY;

	    days = beetweenHours / timeAllWorkDay;// Calculate amount work day

	    /* Calculate the remainder of the working time */
	    hours = beetweenHours % (ProcessingTimeStudy.END_WORK_DAY_STUDY - ProcessingTimeStudy.START_WORK_DAY_STUDY);

	    formatDataStudent.format(formatLineCompleteTime, resourceB.getString(DAYS), days, resourceB.getString(HOURS), hours);
	    formatDataStudent.format(lineWideTable + IDENTATION);
	    formatDataStudent.format(IDENTATION + IDENTATION);
	    formatDataStudent.format(IDENTATION + IDENTATION);
	}

	System.out.println(sb);
	sb.setLength(0);
	formatDataStudent.close();
    }

    public String getFormatCurrentTime(Calendar currentTime) { // Set the date format to display
	SimpleDateFormat dateCurrentTimeformat = new SimpleDateFormat(DATE_FORMAT);
	String buffTime = dateCurrentTimeformat.format(currentTime.getTime());
	return buffTime;
    }

    public String getLineWide(int wideReport) { // Specify the number of dashed lines to display
	StringBuilder buffStringLineTable = new StringBuilder(wideReport);
	for (int i = 1; i <= wideReport; i++) {
	    buffStringLineTable.append("-");
	}
	return buffStringLineTable.toString();
    }

    public int getWideTableReport(Students[] students) {// determining the length of the table
	int buffWideReportLength = 0;
	int wideReportlength = MIN_LINE_INTERVAL;

	for (Students nameLength : students) {
	    int nameStudentsLength = nameLength.getNameStudent().length();
	    int nameCurriculumLength = nameLength.getCurriculumStudend().getNameCurriculum().length();

	    if (nameStudentsLength > nameCurriculumLength) {
		buffWideReportLength = nameStudentsLength;

	    }

	    else {
		buffWideReportLength = nameCurriculumLength;
	    }
	    if (wideReportlength < (buffWideReportLength)) {

		wideReportlength = buffWideReportLength;
	    }
	}

	return (wideReportlength + MIN_INTERVAL_BEETWEEN_WORDS_STUDENTS);

    }

}
