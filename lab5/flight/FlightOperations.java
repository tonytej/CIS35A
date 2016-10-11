/*
Antony Tejakusuma
CIS 35A
Lab 5
Due Date: 07/28/2016
Submission Date: 07/29/2016
*/

package flight;
import exception.FlightException;
import java.util.*;

public class FlightOperations {
	private APIImplementation API = new APIImplementation();

	/**
	* Add passenger
	*
	* @param plane plane to be modified
	*/
	public void addPassenger(Flight plane){	
		try{
			API.addPeople(plane);
		} catch(FlightException e) {
			e.fix();
		}
	}

	/**
	* Remove passenger
	*
	* @param plane plane to be modified
	* @param name person to be removed
	*/
	public void removePassenger(Flight plane, String name){
		API.removePeople(plane, name);
	}
	
	/**
	* Remove passenger from waitlist
	*
	* @param plane plane to be modified
	* @param name person to be removed from the wailist
	*/
	public void removePassengerWaitList(Flight plane, String name){
		API.removePeopleWaitList(plane, name);
	}

	//quit program
	public void quit(){
		System.out.printf("Program Terminated.");
	}
}
