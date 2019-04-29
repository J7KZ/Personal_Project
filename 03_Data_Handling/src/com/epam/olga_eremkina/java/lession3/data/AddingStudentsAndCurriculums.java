package com.epam.olga_eremkina.java.lession3.data;

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
public class AddingStudentsAndCurriculums {

    private static final int FOUR = 4;
    private static final int THREE = 3;
    private static final int TWO = 2;
    private static final int ONE = 1;
    private static final int ZERO = 0;

    public static final String[] courseTitle = new String[] { "Технология Java Servlets", "Structs Framework",
	    "Обзор технологий Java", "Библиотека JFC/Swing", "Технология JDBC" };
    
    public static final String[] cirriculumAndNameTitle = new String[] { "Ivanov Ivan", "Petrov Petr",
	    "J2EE Developer", "Java Developer" };

    public static Students[] createCurriculum() {

	GregorianCalendar startDateStudent1 = new GregorianCalendar(2018, Calendar.MARCH, 15);
	GregorianCalendar startDateStudent2 = new GregorianCalendar(2018, Calendar.MARCH, 22);

	StudentCurriculum CurriculumJ2EEDeveloper = new StudentCurriculum(cirriculumAndNameTitle[TWO], TWO);
	{
	    CurriculumJ2EEDeveloper.getCourseCurriculum()[ZERO] = new CourseCurriculum(courseTitle[ZERO], 16);
	    CurriculumJ2EEDeveloper.getCourseCurriculum()[ONE] = new CourseCurriculum(courseTitle[ONE], 24);

	};
	

	StudentCurriculum CurriculumJavaDeveloper = new StudentCurriculum(cirriculumAndNameTitle[THREE], THREE);
	{
	    CurriculumJavaDeveloper.getCourseCurriculum()[ZERO] = new CourseCurriculum(courseTitle[TWO], 8);
	    CurriculumJavaDeveloper.getCourseCurriculum()[ONE] = new CourseCurriculum(courseTitle[THREE], 16);
	    CurriculumJavaDeveloper.getCourseCurriculum()[TWO] = new CourseCurriculum(courseTitle[FOUR], 16);
	};
	

	Students[] student = new Students[] { new Students(cirriculumAndNameTitle[ZERO], CurriculumJ2EEDeveloper),
		new Students(cirriculumAndNameTitle[ONE], CurriculumJavaDeveloper) };

	student[ZERO].setStartDateTime(StudyProgress.getStartCurriculumDate(startDateStudent1));
	student[ONE].setStartDateTime(StudyProgress.getStartCurriculumDate(startDateStudent2));
	student[ZERO].setFinishDateTime(StudyProgress.getFinishCurriculumDate(startDateStudent1, CurriculumJ2EEDeveloper));
	student[ONE].setFinishDateTime(StudyProgress.getFinishCurriculumDate(startDateStudent2, CurriculumJavaDeveloper));

	return student;

    }

}
