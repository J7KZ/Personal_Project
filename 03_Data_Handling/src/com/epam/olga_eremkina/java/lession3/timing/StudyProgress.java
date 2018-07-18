/**
 * 
 */
package com.epam.olga_eremkina.java.lession3.timing;

import java.util.Calendar;

import com.epam.olga_eremkina.java.lession3.information.StudentCurriculum;
import com.epam.olga_eremkina.java.lession3.information.Students;

/**
 * @author Olga_Eremkina
 *
 */
public class StudyProgress {
    private static final int THIRD_CHOISE = 3;
    private static final int SECOND_CHOICE = 2;
    private static final int FIRST_CHOICE = 1;
    private static final int[] REST_DAYS = { 1, 2, 3, 4, 5, 8, 54, 67, 68, 120, 121, 122, 129, 162, 163, 309, 365 };
    public static final int START_WORK_DAY = 10;
    public static final int END_WORK_DAY = 18;

    public static boolean checkHolidays(Calendar tempDay) {
	for (int i = 0; i < REST_DAYS.length; i++) {
	    if (tempDay.get(Calendar.DAY_OF_YEAR) == REST_DAYS[i]) {
		return true;
	    }
	}
	return false;

    }

    public static boolean checkWeekend(Calendar tempDay) {
	if ((tempDay.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
		|| (tempDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
	    return true;
	}

	return false;
    }

    public static Calendar getFinishCurriculumDate(Calendar startDate, StudentCurriculum curriculum) {
	Calendar tempDate = (Calendar) startDate.clone();
	int totalDuration = curriculum.getTotalDuration();
	int currentHour = tempDate.get(Calendar.HOUR_OF_DAY);

	while (totalDuration != 0) {
	    tempDate.add(Calendar.HOUR_OF_DAY, 1);
	    currentHour = tempDate.get(Calendar.HOUR_OF_DAY);

	    if (((currentHour > START_WORK_DAY) && (currentHour <= END_WORK_DAY)) && (!checkHolidays(tempDate))
		    && (!checkWeekend(tempDate))) {
		totalDuration--;

	    }

	}
	return tempDate;

    }

    public static Calendar getStartCurriculumDate(Calendar startDate) {
	Calendar tempDateTime = (Calendar) startDate.clone();
	int tempTimeHour = tempDateTime.get(Calendar.HOUR_OF_DAY);
	while ((tempTimeHour < START_WORK_DAY) || (tempTimeHour > END_WORK_DAY)
		|| (StudyProgress.checkHolidays(tempDateTime)) || StudyProgress.checkWeekend(tempDateTime)) {
	    tempDateTime.add(Calendar.HOUR_OF_DAY, 1);
	    tempTimeHour = tempDateTime.get(Calendar.HOUR_OF_DAY);

	}

	return tempDateTime;
    }

    public static int TimeBetweenDates(Calendar tempDate1, Calendar tempDate2) {
	int hoursBetweenDates = 0;
	int currentHour = tempDate1.get(Calendar.HOUR_OF_DAY);
	while (tempDate1.before(tempDate2)) {
	    if (((currentHour >= START_WORK_DAY) && (currentHour < END_WORK_DAY)) && (!checkHolidays(tempDate1))
		    && (!checkWeekend(tempDate1)))
		hoursBetweenDates++;
	    tempDate1.add(Calendar.HOUR_OF_DAY, 1);
	    currentHour = tempDate1.get(Calendar.HOUR_OF_DAY);

	}
	return hoursBetweenDates;
    }

    public static int checkComplete(Students studentsInformation, Calendar currentDate) {
	Calendar tempFinishDate = (Calendar) studentsInformation.getFinishDateTime().clone();
	Calendar tempStartDate = (Calendar) studentsInformation.getStartDateTime().clone();
	Calendar tempCurrentDate = (Calendar) currentDate.clone();
	int completeness = 0;

	if ((tempFinishDate.getTimeInMillis() < tempCurrentDate.getTimeInMillis())
		&& (tempStartDate.getTimeInMillis() < tempCurrentDate.getTimeInMillis())) {
	    completeness = FIRST_CHOICE;
	} else if ((tempFinishDate.getTimeInMillis() >= tempCurrentDate.getTimeInMillis())
		&& (tempStartDate.getTimeInMillis() < tempCurrentDate.getTimeInMillis())) {
	    completeness = SECOND_CHOICE;
	} else if ((tempFinishDate.getTimeInMillis() > tempCurrentDate.getTimeInMillis())
		&& (tempStartDate.getTimeInMillis() >= tempCurrentDate.getTimeInMillis())) {
	    completeness = THIRD_CHOISE;
	}
	return completeness;

    }

}
