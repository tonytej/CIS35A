/*
Antony Tejakusuma
CIS 35A
Lab 2 Project 2
Due date: 07/10/2016
Submission date: 07/10/2016
*/

import java.util.*;

public class PoliceOfficer {
	private String name;
	private int badgeNumber;

	//name setter
	public void setName(String n){
		this.name = n;
	}
	//badge number setter
	public void setBadgeNumber(int b){
		this.badgeNumber = b;
	}

	/**
	* Method issue tickets
	*
	* @param car parked car
	* @param t parking ticket to be issued
	* @param m parking meter that reads minutes parked
	*/
	public void issueTicket(ParkedCar car, ParkingTicket t, ParkingMeter m){
		t.printTicket(car, m, name, badgeNumber);
	}

	/**
	* Method that examine whether a ticket is to be issued or not
	*
	* @param m parking meter that reads minutes parked
	* @param car parked car
	* @param t parking ticket to be issued
	*/
	public void examineParkingTime(ParkingMeter m, ParkedCar car, ParkingTicket t){
		if(car.getMinutesParked() > m.getParkingMinutesPurchased()){
			issueTicket(car, t, m);
		} else {
			System.out.printf("Parking time has not expired.\n");
		}
	}
}