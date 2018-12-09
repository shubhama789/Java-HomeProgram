package labAssignments;

import java.util.Scanner;

public class UserChoice {
	
	
	
	public static void main(String[] args) {
			
			System.out.println("Enter the string in which you want to perform some task");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String newString=input;
			System.out.println("Please select from below options: \n");
			System.out.println("1. Add the String to itself ");
			System.out.println("2. Replace odd positions with # ");
			System.out.println("3. Remove duplicate characters in the String ");
			System.out.println("4. Change odd characters to upper case");
			Scanner scanner1 = new Scanner(System.in);
			int option = scanner1.nextInt();
			scanner.close();
			scanner1.close();
			
			
			switch (option) {
			case 1:
				newString=input+input;
				System.out.println("concatinated string with itself is : "+newString);
				break;
			case 2:
				char[] newString1 = newString.toCharArray();
				for(int i=1;i<newString.length();i=i+2) {
					newString1[i]='#';	
				}
				//newString1.toString();
				newString1.toString();
				System.out.println(newString1);
				break;
			case 3:
				
				break;
			default:
				break;
			}
			
	}
}
