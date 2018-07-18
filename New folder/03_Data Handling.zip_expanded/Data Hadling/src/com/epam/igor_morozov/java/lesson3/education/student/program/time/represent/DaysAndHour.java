package com.epam.igor_morozov.java.lesson3.education.student.program.time.represent;

import java.time.Duration;

public class DaysAndHour {

	protected final byte HOURS_IN_DAY = 24;
	protected long days;
	protected long hours;
	public long workHours;

	public DaysAndHour() {
	}

	public DaysAndHour(Duration duration) {
		days = duration.toDays();
		hours = duration.toHours() - duration.toDays() * HOURS_IN_DAY;
	}

	public Duration toDuration() {
		return Duration.ofHours(days * HOURS_IN_DAY + hours);
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
