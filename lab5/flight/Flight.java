/*
Antony Tejakusuma
CIS 35A
Lab 5
Due Date: 07/28/2016
Submission Date: 07/29/2016
*/

package flight;
import java.io.*;
import java.lang.String;
import exception.FlightException;

public class Flight implements Serializable{
	private static final long serialVersionUID = -4248659454426370607L;
	private Passenger[][] SeatingChart;
	private WaitingList waitList = new WaitingList();

	public Flight(){
		SeatingChart = new Passenger[10][4];
		for(int i = 0; i< 10; i++){
			for(int d = 0; d<4; d++){
				SeatingChart[i][d] = new Passenger();
				try{
					SeatingChart[i][d].setName(" ");
				} catch(FlightException e) {
					e.fix();
				}
			}
		}
	}
	
	// Seating chart getter
	public Passenger getSeatingChart(int row, int column){
		return SeatingChart[row][column];
	}
	
	/**
	* Set a seat to a person
	*
	* @param row selected row
	* @param column selected column
	* @param name person to assign the seat to 
	*/
	public void setSeat(int row, int column, String name){
		try{
			SeatingChart[row][column].setName(name);
			System.out.printf("Seat Added!\n");
		} catch(FlightException e) {
			e.fix();
		}	
	}

	// waitlist getter
	public int getWaitList(){
		return waitList.getWaitListNumber();
	}

	// waitlist setter
	public void setWaitList(String name){
		waitList.setWaitListNumber(name);
	}	

	// print seating chart
	public void printSeatingChart() {
		String availability;
		System.out.printf("Printing seating chart...\n");
		System.out.printf("Row \t\t Column \t\t Status\n");
		for(int i = 0; i<10;i++){
				for(int d = 0; d<4; d++){
					if(SeatingChart[i][d].getName().equals(" ")){
						availability = "Available";
					} else {
						availability = "Not Available";
					}
					System.out.printf("%d \t\t %d \t\t\t %s\n",i+1, d+1, availability);
				}
			}
	}

	/**
	* Delete person from seating chart
	*
	* @param name person to be deleted
	*/
	public void searchSeatingChartAndDelete(String name){
		System.out.printf("Searching for passenger...");
		for(int i = 0; i<10;i++){
			for(int d = 0; d<4; d++){
				if(SeatingChart[i][d].getName().equalsIgnoreCase(name)){
					System.out.printf("Passenger found and removed!\n");
					deletePerson(i, d);
					if(waitList.getWaitListNumber()!= 0){
						checkWaitList(i, d);
					}
					return;
				}
			}
		}
		System.out.printf("Passenger not found!\n");	
	}

	// delete person
	public void deletePerson(int row, int column){
		SeatingChart[row][column] = null;
	}

	/**
	* Delete person from waiting list
	*
	* @param name person to be deleted
	*/
	public void deletePersonWaitList(String name){
		try{
			waitList.deletePersonFromWaitList(name);
		} catch(FlightException e) {
			e.fix();
		}
	}

	/**
	* Check the availability of the waitlist
	*
	* @param row row
	* @param column column
	*/
	public void checkWaitList(int row, int column){
		if(waitList.getWaitListNumber() != 0){
			try {
				SeatingChart[row][column] = new Passenger();
				SeatingChart[row][column].setName(waitList.getWaitListName(0));
				waitList.deleteWaitListEntryOne();
			} catch(FlightException e) {
				e.fix();
			}
		}
	}
}
