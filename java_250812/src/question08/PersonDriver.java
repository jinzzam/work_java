package question08;

import java.util.Scanner;

class Person{
	String lastName, firstName;

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public int getLength() {
		int num = lastName.length() + firstName.length();
		return num;
	}

	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public Person() {
	}
}


public class PersonDriver {
	public static void main(String[] args) {
		String fname, lname;
		
		Person person1;
		Person person2;
		Person[] person = new Person[2];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			System.out.print("성을 입력하세요:");
			lname = sc.next();
			System.out.print("이름을 입력하세요:");
			fname = sc.next();
			person[i] = new Person(lname, fname);
			System.out.println("성 : "+ person[i].getFirstName() + "이름 : " + person[i].getLastName() );
			System.out.println("성명의 길이 : " + person[i].getLength());
		}
		
		person1 = person[0];
		person2 = person[1];
		
		sc.close();
	}
}
