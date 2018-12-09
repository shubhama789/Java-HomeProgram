package labAssignments;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DifferenceBetweenDates 
{
	
	public Period Difference()
	{
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date1 in yyyy-MM-dd format :");
		String date1 = scanner.nextLine();
		System.out.println("Enter date2 in yyyy-MM-dd format :");
		String date2 = scanner.nextLine();
		LocalDate inputDate1 = LocalDate.parse(date1,dateTimeFormatter);
		LocalDate inputDate2 = LocalDate.parse(date2,dateTimeFormatter);
		Period period = inputDate1.until(inputDate2);
		return period;
		
	}

	
	public static void main(String[] args)
	{
		
		DifferenceBetweenDates date = new DifferenceBetweenDates();
		Period period = date.Difference();
		
		System.out.println("Difference between two dates date1 and current date is	:\nYears :"
		+Math.abs(period.getYears())+"\nMonths :"+Math.abs(period.getMonths())+"\nDays :"+Math.abs(period.getDays()));
		
		
	}

}
