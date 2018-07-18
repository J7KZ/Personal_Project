import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//import com.epam.olga_eremkina.java.lession3.information.StudentCurriculum;
//import com.epam.olga_eremkina.java.lession3.timing.StudyProgress;

/**
 * 
 */

/**
 * @author Olga_Eremkina
 *
 */
public class Run {
static long i;
    /**
     * @param args
     */
    public static void main(String[] args) {
	
	long n;
	long result=0;
	double resultG=0;
	long resultF=0;
	Scanner in = new Scanner(System.in);
	System.out.println("¬ведите число " );
	n=in.nextLong();
	if (n>0) {
	    result=1;
	    for (long i=1; i<=n; i++) {
		result*=i;
	    }
	   resultG= (long) Gamma(n+1);
	   resultF=factorial(n);
	} else  if(n<0) {
	    System.out.println("бесконечность");
	} else  if (n==0) {result=1;
	}
	System.out.println(result);
	System.out.println(resultG);
	System.out.println(resultF);
	in.close();
	
	
	}
    static double Gamma(double z)
    {
        double tmp1 = Math.sqrt(2*Math.PI/z);
        double tmp2 = z + 1.0/(12 * z - 1.0/(10*z));
        //tmp2 = Math.pow(z/Math.E, z); // ooops; thanks hj
        tmp2 = Math.pow(tmp2/Math.E, z);
        return tmp1 * tmp2;
    }
    
    public static long factorial(long n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
	
	/*GregorianCalendar currentDateTime = new GregorianCalendar(2018, Calendar.APRIL,27);
	Actions act = new Actions();
	act.checkWorkTime(currentDateTime);
	*/
	//act.printDay();
	//Actions.checkWeekend(currentDateTime);
	
    
	/*LocalDate today = LocalDate.now();
	LocalDate birthday = LocalDate.of(1985, Month.MAY, 2);
	 
	Period p = Period.between(birthday, today);
	long p2 = ChronoUnit.HALF_DAYS.between(birthday, today);
	System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
	                   " months, and " + p.getDays() +
	                   " days old. (" + p2 + " days total)");
    }*/
	

}




/*public static Calendar getFinishCurriculumDate(Calendar startDate, StudentCurriculum curriculum) {
	Calendar tempDate = (Calendar) startDate.clone();
	int totalDuration = curriculum.getTotalDuration();
	int currentHour = tempDate.get(Calendar.HOUR_OF_DAY);
	int tempDurationMinute = totalDuration*60;

	while (totalDuration != 0) {
	    tempDate.add(Calendar.HOUR_OF_DAY, 1);
	    currentHour = tempDate.get(Calendar.HOUR_OF_DAY);

	    if (((currentHour > START_WORK_DAY) && (currentHour <= END_WORK_DAY)) && (!checkHolidays(tempDate))
		    && (!checkWeekend(tempDate))) {
		totalDuration--;
		
	    }
	    
	while (tempDurationMinute != 0) {
	    tempDate.add(Calendar.MINUTE, 1);
	    currentHour = tempDate.get(Calendar.HOUR_OF_DAY);

	    if (((currentHour > START_WORK_DAY) && (currentHour <= END_WORK_DAY)) && (!checkHolidays(tempDate))
		    && (!checkWeekend(tempDate))) {
		tempDurationMinute--;
		
	    }
	    if ((tempDate.get(Calendar.MINUTE) > 0) && (totalDuration == 0) ) {
		do {
		    tempDate.add(Calendar.HOUR_OF_DAY, 1);
		}
		while (tempDate.get(Calendar.HOUR_OF_DAY) != START_WORK_DAY);
	    }
	}
	return tempDate;

}

public static Calendar getStartCurriculumDate(Calendar startDate) {
	Calendar tempDateTime = (Calendar) startDate.clone();
	int tempTimeHour = tempDateTime.get(Calendar.HOUR_OF_DAY);
	int tempMinute = 0;
	while ((tempTimeHour < START_WORK_DAY) || (tempTimeHour > END_WORK_DAY)
		|| (StudyProgress.checkHolidays(tempDateTime)) || StudyProgress.checkWeekend(tempDateTime)) {
	    tempDateTime.add(Calendar.HOUR_OF_DAY, 1);
	    tempTimeHour = tempDateTime.get(Calendar.HOUR_OF_DAY);
	    
	    
	    if ((tempDateTime.get(Calendar.MINUTE) > 0)) {
		    tempMinute = tempDateTime.get(Calendar.MINUTE);
		    tempDateTime.add(Calendar.MINUTE, -tempMinute);
		    tempTimeHour = tempDateTime.get(Calendar.HOUR_OF_DAY);
	}
	if ((tempTimeHour >= START_WORK_DAY) || (tempTimeHour < END_WORK_DAY) & (tempDateTime.get(Calendar.MINUTE) > 0)) {
	    tempMinute = tempDateTime.get(Calendar.MINUTE);
	    tempDateTime.add(Calendar.MINUTE, -tempMinute);
	    tempTimeHour = tempDateTime.get(Calendar.HOUR_OF_DAY);
	}
	}
	return tempDateTime;
}
*/