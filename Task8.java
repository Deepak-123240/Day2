package tasks;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	System.out.println("enter number: ");
	int number = sc.nextInt();

	if (number > 0) {

	System.out.println("The number is positive.");

	}else if (number < 0) {

	System.out.println("The number is negative.");

	} else {

	System.out.println("The number is zero.");

	}

	sc.close();
		

	}

}
