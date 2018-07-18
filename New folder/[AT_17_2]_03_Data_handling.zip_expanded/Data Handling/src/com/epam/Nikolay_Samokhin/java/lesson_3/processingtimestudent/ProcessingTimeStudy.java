package com.epam.Nikolay_Samokhin.java.lesson_3.processingtimestudent;

import java.util.Calendar;

import com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent.CurriculumStudent;
import com.epam.Nikolay_Samokhin.java.lesson_3.informationstudent.Students;

public class ProcessingTimeStudy {

    private static final int[] HOLIDAYS = { 1, 7, 13, 45, 54, 91, 102, 121, 127, 163, 244, 308, 359 };
    public final static int START_WORK_DAY_STUDY = 10;
    public final static int END_WORK_DAY_STUDY = 18;
    public final static int START_DAY_STUDENT_1 = -4;
    public final static int START_DAY_STUDENT_2 = -8;

    public static Calendar getStartDateCurriculum(Calendar startDate) { // Calculate start day for students
	Calendar buffDate = (Calendar) startDate.clone();
	int currentHourDay = buffDate.get(Calendar.HOUR_OF_DAY);

	while ((currentHourDay < START_WORK_DAY_STUDY) || (currentHourDay > END_WORK_DAY_STUDY)
		|| (ProcessingTimeStudy.checkHolidayDay(buffDate))
		|| (ProcessingTimeStudy.CheckSaturdayOrSunday(buffDate))) {
	    buffDate.add(Calendar.HOUR_OF_DAY, 1);
	    currentHourDay = buffDate.get(Calendar.HOUR_OF_DAY);
	}

	return buffDate;
    }

    private static boolean CheckSaturdayOrSunday(Calendar buffStartDay) {// Defines days off
	if ((buffStartDay.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
		|| ((buffStartDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY))) {

	    return true;
	}

	return false;
    }

    public static int TimeBeetweenDates(Calendar buffTime1, Calendar buffTime2) {// Defines the difference hours between
										 // two days
	int beetwenDateHours = 0;
	int currentHour = 0;
	;
	currentHour = buffTime1.get(Calendar.HOUR_OF_DAY);
	while ((buffTime1.before(buffTime2))) {

	    if ((currentHour > START_WORK_DAY_STUDY) && (currentHour < END_WORK_DAY_STUDY)
		    && (!checkHolidayDay(buffTime1)) && (!CheckSaturdayOrSunday(buffTime1)))
		beetwenDateHours++;

	    buffTime1.add(Calendar.HOUR_OF_DAY, 1);
	    currentHour = buffTime1.get(Calendar.HOUR_OF_DAY);
	}

	return beetwenDateHours;

    }

    public static boolean checkCompleteCurriculum(Students informationOfStudents, Calendar currentTime) {

	Calendar dateBuffEndDay = (Calendar) informationOfStudents.getEndDateTime().clone();
	Calendar dateBuffCurrentTime = (Calendar) currentTime.clone();

	if (dateBuffCurrentTime.getTimeInMillis() >= dateBuffEndDay.getTimeInMillis()) {
	    return true;
	}
	return false;

    }

    public static boolean checkHolidayDay(Calendar tempBuffStartDay) {
	for (int i = 0; i < HOLIDAYS.length; i++) {
	    if (HOLIDAYS[i] == tempBuffStartDay.get(Calendar.DAY_OF_YEAR)) {
		return true;
	    }
	}
	return false;
    }

    public static Calendar getEndDateCurriculum(Calendar startDate, CurriculumStudent curriculum) {// Calculate end day
												   // for students
	Calendar dateBuffEndDay = (Calendar) startDate.clone();
	int durationHours = curriculum.getSumDuration();
	int currentHourEndDate = dateBuffEndDay.get(Calendar.HOUR_OF_DAY);
	while (!(durationHours == 0)) {
	    dateBuffEndDay.add(Calendar.HOUR_OF_DAY, 1);
	    currentHourEndDate = dateBuffEndDay.get(Calendar.HOUR_OF_DAY);

	    if (((currentHourEndDate >= START_WORK_DAY_STUDY) && (currentHourEndDate < END_WORK_DAY_STUDY))
		    && (!checkHolidayDay(dateBuffEndDay)) && (!CheckSaturdayOrSunday(dateBuffEndDay))) {
		durationHours--;
	    }
	}
	return dateBuffEndDay;
    }

}
