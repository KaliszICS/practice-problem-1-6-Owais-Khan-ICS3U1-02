/**
		* File: Lesson 1.6 - Booleans
		* Author: Owais Ali Khan
		* Date Created: February 20, 2026
		* Date Last Modified: February 20, 2026
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
		Scanner input = new Scanner(System.in);
        System.out.print("Input a boolean: ");
        boolean bool = input.nextBoolean();
        System.out.println(bool);
        
        
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = input.nextInt();
        System.out.println(num > 5);
        
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input pizza: ");
        String pizza = input.nextLine();
        System.out.println(pizza.equals("pizza"));
        
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = input.nextDouble();
		System.out.println(num == 0);
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = input.nextInt();
        System.out.println(num != 0);
        
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a word earlier than google: ");
        String word = input.nextLine();
        System.out.println((word.compareTo("google") > 0));
	}

}
