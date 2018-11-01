import java.util.ArrayList;
import java.util.Scanner;

public class LocatePrimeNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInteger = 0;
		String userContinue;
		System.out.println("Welcome to the prime number locater app!");
		System.out.println("Lets locate some prime numbers");
		do {
			System.out.println("What prime number and so on which number are you looking for?");

			userInteger = Validating.getInt(scan, "");
			System.out
					.println("The number " + userInteger + " prime number is " + PrimeNumLocate.primeNums(userInteger));

			System.out.println("Do you want to find another prime number? (y/n)");
			userContinue = Validating.getString(scan, "");

		} while (userContinue.equalsIgnoreCase("Y"));

		System.out.println("Goodbye");

	}
}
