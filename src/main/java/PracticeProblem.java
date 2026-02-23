/*
Author: Alex Liang
File: Lesson 1.6: Booleans
Date Created: Feb 20, 2026
Date Last Modified: Feb 23, 2026
*/

import Scanner.util.Scanner;

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
	
	boolean torf;
	Scanner input = new Scanner(System.in);
	System.out.println("Input a boolean: ");
	torf = input.nextLine();
	System.out.println(torf);
	}

	public static void q2() {
		//Write question 2 code here
	
	int integer;
	Scanner input = new Scanner(System.in);
	System.out.println("Input an integer: ");
	integer = input.nextInt();
	input.nextLine();
	boolean greaterThan = integer > 5;
	System.out.println(greaterThan);
	}

	public static void q3() {	
		//Write question 3 code here

	String ans = "pizza";
	String ansClient;
	Scanner input = newScanner(System.in);
	System.out.println("Input pizza: ");
	ansClient = input.nextLine();
	boolean result = ansClient.equals(ans);
	System.out.println(result);

	}

	public static void q4() {
		//Write question 4 code here

	int number;
	Scanner input = new Scanner(System.in);
	System.out.println("Input an integer: ");
	number = input.nextInt();
	input.nextLine();
	boolean zero = number == 0;
	System.out.println(zero);

	}

	public static void q5() {
		//Write question 5 code here
	
	int number2;
	Scanner input = new Scanner(System.in);
	System.out.println("Input an integer: ");
	number2 = input.nextInt();
	input.nextLine();
	boolean notZero = number != 0;
	System.out.println(notZero);	
	
	}

	public static void q6() {
		//Write question 6 code here
	
	String ans = "google";
	String inputClient;
	Scanner input = newScanner(System.in);
	System.out.println("Input a word earlier than google: ");
	inputClient = input.nextLine();
	System.out.println(inputClient.compareTo(ans) < 0);
	
	}

}
