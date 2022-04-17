package question2;

public class CheckDigit {
	

	/**
	 * Returns the check digit for num, as described in part (a). Precondition: The
	 * number of digits in num is between one and six, inclusive. num >= 0
	 */
	/**
	 * Complete the getCheck method, which computes the check digit for a number
	 * according to the following rules: - Multiply the first digit by 7, the second
	 * digit (if one exists) by 6, the third digit (if one exists) by 5, and so on.
	 * The length of the method’s int parameter is at most six; therefore, the last
	 * digit of a six-digit number will be multiplied by 2. - Add the products
	 * calculated in the previous step. - Extract the check digit, which is the
	 * rightmost digit of the sum calculated in the previous step.
	 */
	public static int getCheck(int num) {
		int numberOfDigits = getNumberOfDigits(num);
		int sum = 0;
		int mult = 7;
		for (int i = 1; i <= numberOfDigits; i++) {

			sum = sum + getDigit(num, i) * mult;
			mult--;
		}
		System.out.println(sum);
		return sum % 10;

	}

	/**
	 * Returns true if numWithCheckDigit is valid, or false otherwise, as described
	 * in part (b). Precondition: The number of digits in numWithCheckDigit is
	 * between two and seven, inclusive.
	 * 
	 * numWithCheckDigit >= 0
	 */
	public static boolean isValid(int numWithCheckDigit) {

		int check = numWithCheckDigit % 10;
		int num = numWithCheckDigit / 10;
		int newCheck = getCheck(num);
		if (check == newCheck) {
			return true;
		} else {
			return false;
		}
	}

	/** Returns the number of digits in num. */
	public static int getNumberOfDigits(int num) {
		/* implementation not shown */
		return 6;
	}

	/**
	 * Returns the nthdigit of num. Precondition: n >= 1 and n <= the number of
	 * digits in num
	 */
	public static int getDigit(int num, int n) {
		/* implementation not shown */
		switch (n) {
		case 1:

			return 2;
		case 2:
			return 8;
		case 3:
			return 3;
		case 4:
			return 4;
		case 5:
			return 1;
		case 6:
			return 5;
		}
// There may be instance variables, constructors, and methods not shown.
		return 0;
	}
}
