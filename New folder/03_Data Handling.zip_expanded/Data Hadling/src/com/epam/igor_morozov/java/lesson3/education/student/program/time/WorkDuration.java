package com.epam.igor_morozov.java.lesson3.education.student.program.time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import com.epam.igor_morozov.java.lesson3.education.student.program.time.represent.WorkDayAndHours;

public class WorkDuration {

	public WorkDuration() {

	}

	public static LocalDateTime plus(LocalDateTime localDateTime, WorkDayAndHours dayAndHours) {

		Duration duration = dayAndHours.toDuration();

		for (int i = 0; i < dayAndHours.getDays(); i++) {

			if (localDateTime.plus(i, ChronoUnit.DAYS).getDayOfWeek() == DayOfWeek.SATURDAY
					|| localDateTime.plus(i, ChronoUnit.DAYS).getDayOfWeek() == DayOfWeek.SUNDAY) {

				duration = duration.plus(1, ChronoUnit.DAYS);
			}

		}

		LocalDateTime returnDateTime = (LocalDateTime) duration.addTo(localDateTime);
		return returnDateTime;
	}

	public static WorkDayAndHours minus(LocalDateTime localDateTime1, LocalDateTime localDateTime2) {
		Duration duration = Duration.between(localDateTime1, localDateTime2);

		return new WorkDayAndHours(duration);
	}

}
