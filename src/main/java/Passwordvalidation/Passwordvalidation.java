package Passwordvalidation;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Passwordvalidation {

	public static void main(String[] args) {
		passwordvalidation();
		//just a comment
	}

	public static void passwordvalidation() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please select a password:  ");
		String pwd = scanner.next();
		scanner.close();
		if (isPasswordLengthGreaterThenEight(pwd) && containsDigit(pwd) && UpperAndLowerLetter(pwd)) {
			System.out.println("The given password is strong!");
		} else if (isPasswordLengthGreaterThenEight(pwd) == false) {
			System.out.println("The given password is to short!");
		} else if (containsDigit(pwd) == false) {
			System.out.println("The given password contains no numbers!");
		} else if (UpperAndLowerLetter(pwd) == false) {
			System.out.println("The given password contains neither upper nor lower letters!");
		}

	}

	public static boolean isPasswordLengthGreaterThenEight(String password) {
		if (password.length() >= 8) {
			return true;
		} else {
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

	public static boolean UpperAndLowerLetter(String password) {
		boolean outputLower = false;
		boolean outputUpper = false;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isUpperCase(c)) {
				outputUpper = true;
			}
			if (Character.isLowerCase(c)) {
				outputLower = true;
			}
		}
		return outputLower && outputUpper;
	}

}
