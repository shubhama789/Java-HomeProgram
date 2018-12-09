
package ageAndFullName;

public class PersonMain
{
	public static void main(String[] args) {
		Person1 person1=new Person1("Subham","Agarwal",'M');
		//System.out.println(person1);
		person1.calculateAge();
		person1.getFullName("Subham ","Agarwal");
	}
}
