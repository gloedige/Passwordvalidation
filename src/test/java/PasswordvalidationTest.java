import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Passwordvalidation.Passwordvalidation;

class PasswordvalidationTest {

	@Test
	void isPasswordLengthGreaterThenEight_whenPasswordHasAtLeastEightDigits_ThenPasswordIsStrong() {
		// minimun lenght of 8 digits
		//given
		String password = "helloWorld";
		boolean lengthok = true;
		
		//when
		
		boolean result = Passwordvalidation.isPasswordLengthGreaterThenEight(password);
		
		
		//then
		assertEquals(lengthok, result);
	}
	
	@Test
	void isPasswordLengthSmallerThenEight_whenPasswordHasLessThenEightDigits_ThenPasswordIsWeak() {
		// minimun lenght of 8 digits
		//given
		String password = "hello";
		boolean lengthok = false;
		
		//when
		
		boolean result = Passwordvalidation.isPasswordLengthGreaterThenEight(password);
		//then
		assertEquals(lengthok, result);
	}
	
	@Test
	void PasswordContainsNumbers_whenPasswordHasNumbers_ThenPasswordIsOK() {
		
		// minimun lenght of 8 digits
		//given
		String password = "hello1";
		boolean numberexists = true;
		
		//when
		
		boolean result = Passwordvalidation.containsDigit(password);
		//then
		assertEquals(numberexists, result);
	}
	
	@Test
	void PasswordContainsNoNumbers_whenPasswordHasNoNumbers_ThenPasswordIsNotOK() {
		
		// minimun lenght of 8 digits
		//given
		String password = "hello";
		boolean numberexists = false;
		
		//when
		
		boolean result = Passwordvalidation.containsDigit(password);
		//then
		assertEquals(numberexists, result);
	}

}
