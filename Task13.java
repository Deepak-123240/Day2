package tasks;
import java.util.Scanner;

public class Task13 {
	
	    enum Day {
	        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a day of the week: ");
	        String input = scanner.nextLine().toUpperCase();

	        try {
	            Day day = Day.valueOf(input);

	            switch (day) {
	                case MONDAY:
	                    System.out.println("Back to work! It's Monday.");
	                    break;
	                case TUESDAY:
	                    System.out.println("Keep going! It's Tuesday.");
	                    break;
	                case WEDNESDAY:
	                    System.out.println("Halfway through! It's Wednesday.");
	                    break;
	                case THURSDAY:
	                    System.out.println("Almost there! It's Thursday.");
	                    break;
	                case FRIDAY:
	                    System.out.println("It's Friday! Weekend is near.");
	                    break;
	                case SATURDAY:
	                    System.out.println("It's Saturday! Time to relax.");
	                    break;
	                case SUNDAY:
	                    System.out.println("Sunday funday! Prepare for the week.");
	                    break;
	            }

	        } catch (IllegalArgumentException e) {
	            System.out.println("Invalid day entered. Please try again.");
	        }

	        scanner.close();
	    }
	}



	    