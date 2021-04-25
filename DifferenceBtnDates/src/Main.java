import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import java.io.InputStreamReader;

public class Main {

	public static int getDaysLeftInMonth(int day, int month, int year) {
		List<Integer> month_31 = Arrays.asList(1,3,5,7,8,10,12);
		//		List<Integer> month_30 = Arrays.asList(4,6,9,11);

		int noOfDays = 0;
		if (month <=12 && month != 2) {
			noOfDays = Math.abs(((month_31.contains(month)) ? 31 : 30) - day);
		}else if(month == 2) {
			noOfDays =  Math.abs(((year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? 29 : 28) - day);;
		}
		return noOfDays;
	}

	public static int getDaysLeftInYear(int day, int month, int year) {
		int noOfDays = 0;
		for (int i = month; i <= 12; i++) {
			int days = getDaysLeftInMonth(0, i, year);
			if (i == month ) {
				// sub day - 1 to include start date
				noOfDays = Math.abs(days - (day - 1));
			}else {
				noOfDays += days;
			}
		}
		return noOfDays;
	}

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the start date");
//		String startDate = br.readLine();
//		System.out.println("Enter the end date");
//		String endDate = br.readLine();

		String startDate = "05-02-2020";
		String endDate = "08-04-2023";
		
		int startYear = Integer.parseInt(startDate.split("-")[2]);
		int startMonth = Integer.parseInt(startDate.split("-")[1]);
		int startDay = Integer.parseInt(startDate.split("-")[0]);

		int endYear = Integer.parseInt(endDate.split("-")[2]);
		int endMonth = Integer.parseInt(endDate.split("-")[1]);
		int endDay = Integer.parseInt(endDate.split("-")[0]);
		
		if (endYear > startYear) {
			int daysLeftInStartYear = getDaysLeftInYear(startDay, startMonth, startYear);
			int daysLeftInEndYear = 0;
			for (int i = 1; i <= endMonth; i++) {
				if (i == endMonth) {
					daysLeftInEndYear += endDay;
				}else {
					daysLeftInEndYear += getDaysLeftInMonth(0, endMonth, endYear);
				}
			}
			int daysBtnYears = 0;
			if ((endYear - startYear) > 1) {
				for (int year = (startYear+1); year < endYear; year++) {
					daysBtnYears += (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? 366 : 365;
				}
			}
			System.out.println("Total days btn " + startDate + " & " + endDate + " is " + (daysLeftInStartYear + daysBtnYears + daysLeftInEndYear));
		}else {
			if (startMonth == endMonth) {
				System.out.println("Total days btn " + startDate + " & " + endDate + " is " + (endDay - startDay));
			}else {
				int totalDays = 0;
				for (int i = startMonth; i < endMonth; i++) {
					if (i == startMonth) {
						totalDays = getDaysLeftInMonth(startDay,i, endYear);
					}else {
						totalDays += getDaysLeftInMonth(0,i, endYear);
					}
				}
				totalDays += endDay;
				System.out.println("Total days btn " + startDate + " & " + endDate + " is " + totalDays);
			}
		}

	}
}
