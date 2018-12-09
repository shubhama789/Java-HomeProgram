package ageAndFullName;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Person1
{
	private String firstName;
	private String lastName;
	private char gender;
	
	
	
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Person1(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Person1 [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
	}
	
	public void calculateAge()
	{
		System.out.println("Enter your dob in yyyy-MM-dd format ");
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String input = scanner.nextLine();
		LocalDate dob = LocalDate.parse(input,dateTimeFormatter);
		System.out.println("Date is : "+input);
		
		LocalDate localDate=LocalDate.now();
		Period period =dob.until(localDate);
		System.out.println("Your age is : "+period.getYears());
	}
	
	public void getFullName(String firstName, String lastName)
	{
		StringBuilder stringBuilder = new StringBuilder(14);
		stringBuilder.append(firstName).append(getLastName());
		System.out.println(stringBuilder.toString());
	}
}
