package demo_java;
import java.text.NumberFormat;
import java.util.Scanner;

public class calcMortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Define constants for monthly interest rate and months in a year
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Principal (Loan Amount): ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Loan Term (Years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        // Calculate the mortgage payment
        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        // Format and display the result
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your monthly mortgage payment: " + mortgageFormatted);

        // Close the scanner
        scanner.close();
	}

}
