/*
Author: Alex Liang
File: Lesson 1.6: Booleans
Date Created: Feb 20, 2026
Date Last Modified: Feb 23, 2026
*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here

Scanner input = new Scanner(System.in);
	String torf;
	System.out.print("Input a boolean: ");
	torf = input.nextLine();
	System.out.print(torf);
	System.out.println();
	}

	public static void q2() {
		//Write question 2 code here
	
	int integer;
	Scanner input = new Scanner(System.in);
	System.out.print("Input an integer: ");
	integer = input.nextInt();
	input.nextLine();
	boolean greaterThan = integer > 5;
	System.out.print(greaterThan);
	System.out.println();
	}

	public static void q3() {	
		//Write question 3 code here

Scanner input = new Scanner(System.in);
	String ans = "pizza";
	String ansClient;
	System.out.print("Input pizza: ");
	ansClient = input.nextLine();
	boolean result = ansClient.equals(ans);
	System.out.print(result);
	System.out.println();

	}

	public static void q4() {
		//Write question 4 code here
	
Scanner input = new Scanner(System.in);
	int number;
	System.out.println("Input an integer: ");
	number = input.nextInt();
	input.nextLine();
	boolean zero = number == 0;
	System.out.println(zero);

	}

	public static void q5() {
		//Write question 5 code here
	
Scanner input = new Scanner(System.in);
	int number2;
	System.out.print("Input an integer: ");
	number2 = input.nextInt();
	input.nextLine();
	boolean notZero = number2 != 0;
	System.out.print(notZero);	
	System.out.println();
	
	}

	public static void q6() {
		//Write question 6 code here

Scanner input = new Scanner(System.in);
	String ans = "google";
	String inputClient;
	System.out.print("Input a word earlier than google: ");
	inputClient = input.nextLine();
	System.out.print(inputClient.compareTo(ans) < 0);
	System.out.println();
	
	}

}
