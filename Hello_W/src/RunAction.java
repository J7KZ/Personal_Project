/**
 * 
 */


import java.util.Calendar;
import java.util.GregorianCalendar;

import com.epam.olga_eremkina.java.lession3.information.CourseCurriculum;
import com.epam.olga_eremkina.java.lession3.information.StudentCurriculum;
import com.epam.olga_eremkina.java.lession3.information.Students;
import com.epam.olga_eremkina.java.lession3.timing.StudyProgress;

/**
 * @author Olga_Eremkina
 *
 */
public class RunAction {
   // public static void someAction() {
	
	
	public final String[]courseTitle = new String[] {
		     "Технология Java Servlets", "Structs Framework"
	    };
	
    

}

   /* GregorianCalendar startDateStudent1 = new GregorianCalendar(2018, Calendar.MARCH, 6);
	StudentCurriculum CurriculumJavaDeveloper = new StudentCurriculum("Java Developer", 3);
	    {
		CurriculumJavaDeveloper.getCourseCurriculum()[0] = new CourseCurriculum("Обзор технологий Java", 8);
		CurriculumJavaDeveloper.getCourseCurriculum()[1] = new CourseCurriculum("Библиотека JFC/Swing", 16);
		CurriculumJavaDeveloper.getCourseCurriculum()[2] = new CourseCurriculum("Технология JDBC", 116);
	    };
	Calendar dateStart = StudyProgress.getStartCurriculumDate(startDateStudent1);
	System.out.println(dateStart.getTime());
	
	Calendar dateFinish = StudyProgress.getFinishCurriculumDate(startDateStudent1, CurriculumJavaDeveloper);
	System.out.println(dateFinish.getTime());
	
	int workDay = StudyProgress.END_WORK_DAY - StudyProgress.START_WORK_DAY;
	int timeBetween = StudyProgress.TimeBetweenDates(dateStart, dateFinish);
	int td = timeBetween/workDay;
	int tdh = timeBetween % workDay;
	System.out.println("Разница = " + td + " дней и " + tdh + " часов");
	//Calendar currentDate = new GregorianCalendar();
	
	
	
    }
    
    }	
	long difference = dateFinish.getTimeInMillis() - dateStart.getTimeInMillis();
	long days = difference/(24*60*60*1000);
	System.out.println(days);
	
	
	расчет количества дней и часов на выполнение задания
	Calendar tempDate = (Calendar) dateStart.clone();
	long dif = dateFinish.getTimeInMillis() - dateStart.getTimeInMillis();

	 int HOUR = 3600 * 1000;
	 int DAY = HOUR * 24;

	// здесь дни
	long days11 = dif / DAY;
	// здесь часы
	long hours11 = (dif - days11 * DAY) / HOUR;
	if (hours11 >= 8) {
	    days11++;
	    hours11 = 0;
	}
	long td1 = 0;
	while (tempDate.before(dateFinish)) {
	    if ( (StudyProgress.checkHolidays(tempDate))
		    || (StudyProgress.checkWeekend(tempDate))) {
		td1++;
		
	    }
	    tempDate.add(Calendar.DAY_OF_MONTH, 1);
	}
	days11 = days11-td1;
	System.out.println(td1);
	System.out.println("Разница1 = " + days11 + " дней и " + hours11 + " часов"  ); 
	
	
	
	Calendar tempDate = (Calendar) dateStart.clone();
	//System.out.println(tempDate.getTime());
	//GregorianCalendar tempDate = new GregorianCalendar();
	int differenceHours = 0;
	int differenceDays = 0;
	int currentHour = 0;
	currentHour = tempDate.get(Calendar.HOUR_OF_DAY);
	//tempDate.add(Calendar.HOUR_OF_DAY, 1);
	
	
	while (tempDate.before(dateFinish)) {
	    if (((currentHour > 10) && (currentHour <= 18)) && (!StudyProgress.checkHolidays(tempDate))
		    && (!StudyProgress.checkWeekend(tempDate))) {
		differenceHours++;
		tempDate.add(Calendar.HOUR_OF_DAY, 1);
		currentHour = tempDate.get(Calendar.HOUR_OF_DAY);
		if (differenceHours >= 8) {
		    differenceDays++;
		    differenceHours = 0;
		}
	    }
	   // break;
	}
	System.out.println(tempDate.getTime());
	System.out.println("Разница1 = " + differenceDays + " дней и " + differenceHours + " часов"  );  
	*/



