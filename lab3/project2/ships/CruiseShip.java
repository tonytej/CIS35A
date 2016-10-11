/*
Antony Tejakusuma
CIS 35A
Lab 3 Project 2
Due Date: 07/15/2016
Submission Date: 07/15/2016
*/
package ships;
import java.util.*;
public class CruiseShip extends Ship {
	private int numberOfRooms;
	private int numberOfGuests;
	private int numberOfStops;
	private float pricePerPerson;
	private int cruiseDuration;

	//initializer constructor
	CruiseShip(int n, int n1, int n2, float value, int n3){
		this.numberOfRooms = n;
		this.numberOfGuests = n1;
		this.numberOfStops = n2;
		this.pricePerPerson = value;
		this.cruiseDuration = n3;
	}

	//print ship report
	public void printShipReport(){
		System.out.printf("Cruise Ship\n");
		System.out.printf("Name: %s\n", getName());
		System.out.printf("Year Made: %d\n", getYearMade());
		System.out.printf("Producer: %s\n", getProducer());
		System.out.printf("Weight: %.0f kg\n", getWeight());
		System.out.printf("Number of Rooms: %d\n", numberOfRooms);
		System.out.printf("Number of Guests: %d\n", numberOfGuests);
		System.out.printf("Number of Stops: %d\n", numberOfStops);
		System.out.printf("Price per Person: $%.2f\n", pricePerPerson);
		System.out.printf("Cruise Duration: %d days\n\n", cruiseDuration);
	}
}
