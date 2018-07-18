import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.epam.olga_eremkina.java.lession3.information.CourseCurriculum;
import com.epam.olga_eremkina.java.lession3.information.StudentCurriculum;



/**
 * 
 */

/**
 * @author Olga_Eremkina
 *
 */
public class Actions {
    private static final int START_WORK_DAY = 10;
    private static final int END_WORK_DAY = 14;
    private static final int[] restDays = { 1, 2, 3, 4, 5, 8, 54, 67, 68, 120, 121, 122, 129, 162, 163, 309, 365 };

    // GregorianCalendar currentDateTime = new GregorianCalendar();

    /*
     * int currentTimeHour = currentDateTime.get(Calendar.HOUR_OF_DAY); int
     * currentTimeMinutes = currentDateTime.get(Calendar.MINUTE); int currentDay =
     * currentDateTime.get(Calendar.DAY_OF_YEAR);
     */

    public Calendar checkWorkTime(Calendar startDate) {
	Calendar currentDateTime = (Calendar) startDate.clone();
	int currentTimeHour = currentDateTime.get(Calendar.HOUR_OF_DAY);
	int currentTimeMinutes = currentDateTime.get(Calendar.MINUTE);
	int currentDay = currentDateTime.get(Calendar.DAY_OF_YEAR);
	if ( (Actions.printDay(currentDateTime)) || (Actions.checkWeekend(currentDateTime))) {
	    // currentDateTime.add(Calendar.HOUR_OF_DAY, 1);
	    // currentTimeHour = currentDateTime.get(Calendar.HOUR_OF_DAY);
System.out.println("отдых");
	   // System.out.println(currentDay);
	    System.out.println("рабочее врем€ " + currentTimeHour + " часов " + currentTimeMinutes + " минут");
	}
	else { 
	    System.out.println("работа");
	}
	return currentDateTime;

	// System.out.println("не рабочее врем€ " + currentTimeHour + " часов " +
	// currentTimeMinutes + " минут");

	// System.out.println(currentDay);

    }

    public static boolean printDay(Calendar curDay) {
	for (int i = 0; i < restDays.length; i++) {
	    if (restDays[i] == curDay.get(Calendar.DAY_OF_YEAR)) {
		return true;
	    }

	}
	return false;

    }
    
    public static boolean checkWeekend(Calendar currentDay) {
  	if ((currentDay.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
  		|| (currentDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
  	    return true;
  	}

  	return false;
      }

   /* public int getTotalDuration() {
	int totalDuration = 0;
	int[] course = {16, 16, 8};
	for (int i = 0; i < course.length; i++) {
	    totalDuration += course[i];	    
	}
	return totalDuration;
    }*/

    
public Calendar getFinishCurriculumDate(Calendar startDate) {
	
	return startDate;
	
	
    }
   /* public  void checkWeekend(Calendar currentDay) {
	if ((currentDay.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
		|| (currentDay.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
	    System.out.println("не рабочий день " + currentDay.get(Calendar.DAY_OF_WEEK));
	} else {
	    System.out.println("рабочий день " + currentDay.get(Calendar.DAY_OF_WEEK));
	}*/
Scanner fs = null;


try {
    fs = new Scanner (new File ("им€ файла"));
} catch (FileNotFoundException e1) {
    
    e1.printStackTrace();
    
    
    fs.useDelimiter(System.getProperty("line.separator"));
    while(fs.hasNext()){
        String fsw = fs.next();
        //int i;
        //System.out.println("—трока: " + fs.next());
        //for (Ingridients weight: ingridient ) {
    	fsw = fsw.replaceAll("\\D+ ", "");
    	double fsd = Double.parseDouble(fsw);
    	//ingridient[i] = fsd;
    	System.out.println(fsd);
        }
    fs.close();