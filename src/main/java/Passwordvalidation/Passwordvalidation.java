package Passwordvalidation;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Passwordvalidation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please select a password:  ");
		String pwd = scanner.next();
		if (isPasswordLengthGreaterThenEight(pwd)==true && containsDigit(pwd)==true) {
			System.out.println("The given password is strong!");
		}
		else if (isPasswordLengthGreaterThenEight(pwd)==false){
			System.out.println("The given password is to short!");
		}
		else if (containsDigit(pwd)==false){
			System.out.println("The given password contains no numbers!");
		} 

	}

	public static boolean isPasswordLengthGreaterThenEight(String password) {
		if (password.length() >= 8) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean containsDigit(String password) {
	    boolean containsDigit = false;

	    if (password != null && !password.isEmpty()) {
	        for (char c : password.toCharArray()) {
	            if (containsDigit = Character.isDigit(c)) {
	                break;
	            }
	        }
	    }

	    return containsDigit;
	}

}
