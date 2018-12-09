package labAssignments;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Duration 
{
	
	public Period Difference()
	{
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("Enter date in yyyy-MM-dd format :");
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		scanner.close();
		LocalDate inputDate = LocalDate.parse(date,dateTimeFormatter);
		LocalDate currentDate = LocalDate.now();
		Period period = inputDate.until(currentDate);
		return period;
	}

	public static void main(String[] args) 
	{
		Duration date1 = new Duration();
		Period period = date1.Difference();
		System.out.println("Difference between two date is :\nYears :"
		+period.getYears()+"\nMonths :"+period.getMonths()+"\nDays :"+period.getDays());
	}

}
