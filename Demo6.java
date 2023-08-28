package exceptionHandling;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=s.next();
		System.out.println(name);
		System.out.println("Enter your Age");
		int age=s.nextInt();
		if(age>=18) {
			System.out.println("Eligible to Vote");
		}
	
			else {
		
			//System.out.println("Not Eligible Voter");
			throw new VoterAgeException("age is 18");
		}
	
		System.out.println("Enter your Gender");
		String gender=s.next();
		System.out.println(gender);

	}

}
