package javaBasics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		// Created object for scanner class and provided Input stream to enter data
		
		Scanner scanData = new Scanner(System.in); 
		
		System.out.println("Hello! What's your Name.?: ");
		
		//nextLine() used to read text (STRING)
		
		String name = scanData.nextLine();	
		
		System.out.println("Hello "+name+" How are you.?");
		
		String status = scanData.nextLine();
		
		//nextInt() used to read integers
		
		System.out.println("Confirm your Age: ");
		
		int Age = scanData.nextInt();
		
		System.out.println("Thanks for the Confirmation!");

	}

}
