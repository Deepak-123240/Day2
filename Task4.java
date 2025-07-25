package tasks;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name: ");

		String firstName = sc.nextLine();

		System.out.println("Enter Last Name: ");

		String lastName = sc.nextLine();

		System.out.println("\nHello," + firstName + " " + lastName + "! Welcome to the system.");

		sc.close();

}}
