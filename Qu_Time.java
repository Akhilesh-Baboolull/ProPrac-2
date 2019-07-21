/**
 * @author Akhilesh
 * Version 1.0
 *
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Qu_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in); //cerating identifier for keyboard input
		DecimalFormat df2 = new DecimalFormat("###.##");
		
		double seconds;
		double minutes;
		int choice;
		
		do {
		System.out.println("Conversion Seconds to Minutes"); //title
		
		do {
		System.out.print("Enter number of seconds to be converted: ");
		
		seconds = myInput.nextDouble(); //Input number of seconds to convert
		
		if (seconds <= 0) { //Validation of value input
			System.out.print("Invalid value entered!Please re-enter a value greater than 0");
		}
		
		}while(seconds <= 0); //allowing user to re-enter
		
		minutes = seconds / 60; //conversion to minutes
						
		//output minutes converted rounded to 2 decimal places
		System.out.println(seconds + " seconds converted into minutes is: " + df2.format(minutes) + " minutes."); 
		
		//Displaying a menu to ask user if he/she wants to try again
		System.out.println("Choose 1 to Re-Try");
		System.out.println("Choose 2 to Exit the program");
		
		 do {
			 
			 System.out.print("Choose whether to re-try or exit the program: ");
			 choice = myInput.nextInt();
		
		if (choice != 1 && choice != 2) { //validating choice entered
			System.out.println("Invalid choice! Please Re-Enter..");
		}
		
		 }while(choice != 1 && choice != 2);
		 
		 if (choice == 2){
			 System.out.print("You are exiting the program!"); 
		 }
		 
		}while(choice == 1);
		
		
		myInput.close();
		
	}

}
