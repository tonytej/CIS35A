/*
Antony Tejakusuma
CIS 35A
Lab 2 Project 2
Due date: 07/10/2016
Submission date: 07/10/2016
*/

import java.util.*;

public class ParkingTicket {
	private int fine = 25;
	/**
	* Method that calculates fine according to the rule provided
	*
	* @param car parked car
	* @param m parking meter that reads minutes parked
	*/
	public void calculateFine(ParkedCar car, ParkingMeter m){
		if(car.getMinutesParked() - m.getParkingMinutesPurchased() > 60){
			//formula that calculates fine according to the rule
			fine += (10*(((car.getMinutesParked() - m.getParkingMinutesPurchased()) / 60) - 1)); 
		}
	}

	/**
	* Method that prints parking ticket
	*
	* @param car parked car
	* @param m parking meter that reads minutes parked
	* @param officerName name of police officer issuing ticket
	* @param badgeNum badge number of police officer issuing ticket
	*/
	public void printTicket(ParkedCar car, ParkingMeter m, String officerName, int badgeNum){
		System.out.printf("Parking Ticket\n\nMake: %s\n", car.getMake());
		System.out.printf("Model: %s\n", car.getModel());
		System.out.printf("Color: %s\n", car.getColor());
		System.out.printf("License Number: %s\n", car.getLicenseNumber());
		calculateFine(car, m);
		System.out.printf("Fine: $%d.00\n", fine);
		System.out.printf("Police Officer Name: %s\n", officerName);
		System.out.printf("Police Officer Badge Number: %d\n", badgeNum);
	}
}