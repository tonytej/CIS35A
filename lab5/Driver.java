/*
Antony Tejakusuma
CIS 35A
Lab 5
Due Date: 07/28/2016
Submission Date: 07/29/2016
*/

import exception.FlightException;
import flight.Flight;
import flight.FlightOperations;
import util.FileIO;
import java.util.*;

public class Driver {
	public static void main(String [] args) {

		//initialize necessary variables
		FileIO inputFile = new FileIO();
		int decision = 0;
		String name;
		Flight airplane = new Flight();
		airplane = inputFile.readFile();
		FlightOperations operations = new FlightOperations();
		airplane.printSeatingChart();
		Scanner input = new Scanner(System.in);

		do {
			System.out.printf("Enter numbers associated with action:\n");
			System.out.printf("(1) Add Passenger\n");
			System.out.printf("(2) Remove Passenger\n");
			System.out.printf("(3) Quit\n");
			decision = input.nextInt();
			if(decision == 1) {
				operations.addPassenger(airplane);
			}
			if(decision == 2) {
				int choice=0;
				System.out.printf("Enter name of passenger: ");
				input.nextLine();
				name = input.nextLine();
				System.out.printf("Enter where do you want to delete the passenger:\n");
				System.out.printf("(1) Flight\n");
				System.out.printf("(2) Waitlist\n");
				choice = input.nextInt();
				if(choice == 1){
					operations.removePassenger(airplane, name);
				}
				if(choice == 2){
					operations.removePassengerWaitList(airplane, name);
				}
			}
		}
		while(decision != 3);
		operations.quit();
		inputFile.writeFile(airplane);
	}
	
}
