package Passwordvalidation;

public class Passwordvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
