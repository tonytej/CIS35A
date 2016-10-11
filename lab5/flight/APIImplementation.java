/*
Antony Tejakusuma
CIS 35A
Lab 5
Due Date: 07/28/2016
Submission Date: 07/29/2016
*/

package flight;
import java.util.*;
import exception.FlightException;

public class APIImplementation implements API {

	/**
	* Add people to passenger list and seating chart
	*
	* @param plane plane to be filled
	*/
	public void addPeople(Flight plane) throws FlightException
	{
		String passengerName = null;
		int row = 0, column = 0;
		boolean repeat = true;
		Scanner input = new Scanner(System.in);
		int openSeats = 0, takenSeats = 0;
		for(int i = 0; i<10; i++){
			for(int d = 0; d<4; d++){
				if(plane.getSeatingChart(i, d).getName().equals(" ")){
					openSeats++;
				} else {
					takenSeats++;
				}
			}
		}
		System.out.printf("There are %d open seats available\n", openSeats);
		System.out.printf("Enter name of passenger: ");
		passengerName = input.nextLine(); 

		if(takenSeats == 40){
			System.out.printf("Plane is full. You are now number %d in the waiting list\n", plane.getWaitList());
			plane.setWaitList(passengerName);
		} else {
			System.out.printf("Enter row of seat: ");
			row = input.nextInt()-1;
			if(row > 9 || row < 0){
				throw new FlightException(1, "Row number cannot be more than 10 or less than 1, please use valid input\n\n");
			}
			System.out.printf("Enter column of seat: ");
			column = input.nextInt()-1;
			if(column > 3 || column < 0){
				throw new FlightException(1, "Column number cannot be more than 4 or less than 1, please use valid input\n\n");
			}
			if(!plane.getSeatingChart(row, column).getName().equals(" ")){
				throw new FlightException(1, "Seat is taken, please try again\n");
			} else {
				plane.setSeat(row, column, passengerName);
			}
		}
	}
		
	/**
	* Remove people from passenger list and seating chart
	*
	* @param plane plane to be filled
	* @param name person's name to be removed
	*/
	public void removePeople(Flight plane, String name){
		plane.searchSeatingChartAndDelete(name);
	}
	
	/**
	* Remove people from waitlist
	*
	* @param plane plane to be filled
	* @param name person's name to be removed
	*/
	public void removePeopleWaitList(Flight plane, String name){
		plane.deletePersonWaitList(name);
	}
}
