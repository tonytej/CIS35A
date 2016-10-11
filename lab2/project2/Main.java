/*
Antony Tejakusuma
CIS 35A
Lab 2 Project 2
Due date: 07/10/2016
Submission date: 07/10/2016
*/

import java.util.*;

public class Main{
	public static void main(String[] args){
		//Initialize car
		ParkedCar car = new ParkedCar();
		car.setMake("Chevrolet");
		car.setModel("Malibu");
		car.setColor("Gray");
		car.setLicenseNumber("7GT6QT8");
		car.setMinutesParked(243);

		//Initialize parking meter
		ParkingMeter meter = new ParkingMeter();
		meter.setParkingMinutesPurchased(60);

		//Initialize parking ticket
		ParkingTicket ticket = new ParkingTicket();
		//Initialize police officer
		PoliceOfficer officer = new PoliceOfficer();
		officer.setName("John Doe");
		officer.setBadgeNumber(333);
		//police officer examining parking time
		officer.examineParkingTime(meter, car, ticket);
	}
	
}