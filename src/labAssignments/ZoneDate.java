package labAssignments;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneDate
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Zone Id :");
		String input = scanner.nextLine();
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(input));
		System.out.println(zonedDateTime);
	}
}
