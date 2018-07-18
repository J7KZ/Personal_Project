package com.epam.igor_morozov.java.lesson3.education.student.program.time.represent;

import java.time.Duration;

public class WorkDayAndHours extends DaysAndHour {

	private final byte WORK_HOURS_IN_DAY = 8;

	public WorkDayAndHours(Duration duration) {
		super(duration);
		verification();
	}

	public WorkDayAndHours(long hours) {

		days = hours / WORK_HOURS_IN_DAY;
		this.hours = hours - days * WORK_HOURS_IN_DAY;

		workHours = days * WORK_HOURS_IN_DAY + this.hours;

		verification();

	}

	private void verification() {
		if (hours == 0) {
			days--;
			hours = WORK_HOURS_IN_DAY;
		}
		if (hours > WORK_HOURS_IN_DAY) {
			days++;
			hours = 0;
		}
	}

	public long getDays() {
		return days;
	}

	public void setDays(long days) {
		this.days = days;
	}

	public long getHours() {
		return hours;
	}

	public void setHours(long hours) {
		this.hours = hours;
	}

}
