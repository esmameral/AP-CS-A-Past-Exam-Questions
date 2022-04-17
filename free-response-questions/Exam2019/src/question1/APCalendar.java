package question1;

import java.util.Calendar;

public class APCalendar {
	public static void main(String[] args) {
		
int x=4;
int b=0;
b=(x<0?4:9);
		
	}

	/** Returns true if year is a leap year and false otherwise. */
	private static boolean isLeapYear(int year) { /* implementation not shown */
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		return false;
	}

	/**
	 * Returns the number of leap years between year1 and year2, inclusive.
	 * Precondition: 0 <= year1 <= year2
	 */
	public static int numberOfLeapYears(int year1, int year2) { 
		/* to be implemented in part (a) */
		return 0;
	}

	/**
	 * Returns the value representing the day of the week for the first day of year,
	 * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
	 */
	private static int firstDayOfYear(int year) { 
		/* implementation not shown */
		Calendar calender = Calendar.getInstance();
		calender.set(year, 0, 0);
		return calender.get(Calendar.DAY_OF_WEEK);
	}

	/**
	 * Returns n, where month, day, and year specify the nth day of the year.
	 * Returns 1 for January 1 (month = 1, day = 1) of any year. Precondition: The
	 * date represented by month, day, year is a valid date.
	 */
	private static int dayOfYear(int month, int day, int year) { 
		/* implementation not shown */

		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day);
		return c.get(Calendar.DAY_OF_YEAR);

	}

	/**
	 * Returns the value representing the day of the week for the given date (month,
	 * day, year), where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes
	 * Saturday. Precondition: The date represented by month, day, year is a valid
	 * date.
	 */
	public static int dayOfWeek(int month, int day, int year) { 
		/* to be implemented in part (b) */
		

		return 0;
	}
	// There may be instance variables, constructors, and other methods not shown.
}
