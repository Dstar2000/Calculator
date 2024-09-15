					//CALCULATOR USING MULTI-LEVEL INHERITANCE

package inher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	int a, b, c;
	Scanner s = new Scanner(System.in);
	void Add() {
		System.out.println("Please enter the values to add");
		a = s.nextInt();
		b = s.nextInt();
		c = a + b;
		System.out.println("The addition of " + a + " and " + b + " is " + c);
	}

	void Sub() {
		System.out.println("Please enter the values to substract");
		a = s.nextInt();
		b = s.nextInt();
		c = a - b;
		System.out.println("The substraction of " + a + " and " + b + " is " + c);
	}
}

class B extends Calculator {
	void Mul() {
        System.out.println("Please enter the values to multiply: ");
            a = s.nextInt();
            b = s.nextInt();
            c = a * b;
            System.out.println("The multiplication of " + a + " and " + b + " is " + c);
    }

	void Div() {
		try {
			System.out.println("Please enter the values to divide: ");
			a = s.nextInt();
			b = s.nextInt();
			if (b == 0) {
				System.out.println("Division by zero is not allowed.");
				return;
			}
			c = a / b;
			System.out.println("The division of " + a + " and " + b + " is " + c);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter valid integers.");
			s.next(); // Clear the invalid input
		}
	}
}

class C extends B {
	 void Rem() {
	        System.out.println("Please enter the values to find the remainder: ");
	        try {
	            a = s.nextInt();
	            b = s.nextInt();
	            if (b == 0) {
	                System.out.println("Division by zero is not allowed.");
	                return;
	            }
	            c = a % b;
	            System.out.println("The remainder of " + a + " and " + b + " is " + c);
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter valid integers.");
	            s.next(); 
	        }
	    }
}

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Calculator");
		C c = new C();
		boolean r = true;

		while (r) {
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Division");
			System.out.println("4. Multiply");
			System.out.println("5. Reminder");
			System.out.println("6. Exit");

			System.out.print("Please enter your choice: ");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				c.Add();
				break;
			case 2:
				c.Sub();
				break;
			case 3:
				c.Div();
				break;
			case 4:
				c.Mul();
				break;
			case 5:
				c.Rem();
				break;
			case 6:
				System.out.println("Exiting.....");
				return;
			default:
				System.out.println("Invalid Choice...!");
				break;
			}
		}
		s.close();
	}
}
