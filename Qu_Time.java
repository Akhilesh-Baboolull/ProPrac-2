import java.util.Scanner;

/**
 * @author Akhilesh
 * Version 1.0
 *
 */



public class Qu_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		
		
		double seconds;
		double minutes;
		int choice;
		
		do {
		System.out.println("Conversion Seconds to Minutes");
			
		System.out.print("Enter number of seconds to be converted: "); 
		seconds = myInput.nextDouble(); //Input number of seconds
		
		minutes = seconds / 60; //calculation of minutes
			
		System.out.println(seconds + " seconds converted into minutes is: " + minutes + " minutes."); //printing the result
		//Displaying a menu if the user wants to re-try
		System.out.println("Choose 1 to Re-Try");
		System.out.println("Choose 2 to Exit the program");
			
		 do {
			 System.out.print("Choose whether to re-try or exit the program: ");
		choice = myInput.nextInt();
		
		if (choice != 1 && choice != 2) { //validating the choice entered
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
