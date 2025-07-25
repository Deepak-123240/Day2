package tasks;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import java.text.DecimalFormat;

import java.util.Scanner;


public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		LocalDate currentDate = LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String formattedDate = currentDate.format(formatter);

		System.out.print("Enter amount: ");

		DecimalFormat currencyFormatter = new DecimalFormat("#,##0.00");

		double amount = sc.nextDouble();

		String formattedAmount = currencyFormatter.format(amount);

		System.out.println("Current Date:" + formattedDate);

		System.out.println("Formatted Amount: + formattedAmount");

		sc.close();
		

	}

}
