/*
Antony Tejakusuma
CIS 35A
Lab 5
Due Date: 07/28/2016
Submission Date: 07/29/2016
*/

package flight;
import java.io.Serializable;
import exception.FlightException;
import java.util.*;

public class WaitingList implements Serializable{
	private static final long serialVersionUID = -5097992391530667355L;
	private Passenger[] waitingList;
	private int waitingListNumber;

	public WaitingList(){
		waitingList = new Passenger[10];
		for(int i = 0; i<10; i++){
			waitingList[i] = new Passenger();
			try{
				waitingList[i].setName(" ");
			} catch(FlightException e) {
				e.fix();
			}
		}
	}

	//waitlistname getter
	public String getWaitListName(int i){
		return waitingList[i].getName();
	}

	// Delete the first person in the waitlist
	public void deleteWaitListEntryOne(){
		for(int i = 0; i<10; i++){
			if(i < 9)
				waitingList[i] = waitingList[i+1];
			else{}
		}
		try{
			waitingList[9].setName(" ");
		} catch(FlightException e) {
			e.fix();
		}
		System.out.printf("First person in the waitlist has been assigned a seat.\ni");
	}

	//waitlistnumber getter
	public int getWaitListNumber(){
		for(int i = 0; i<10; i++){
			if(waitingList[i].getName().equals(" ")){
				waitingListNumber = i+1;
				return waitingListNumber;
			}
		}
		return 0;
	}

	//waitlistnumber setter
	public void setWaitListNumber(String name){
		try{
			waitingList[waitingListNumber].setName(name);
		} catch(FlightException e) {
			e.fix();
		}	
	}

	/**
	* Delete person from waitlist
	*
	* @param name person to be deleted
	*/
	public void deletePersonFromWaitList(String name) throws FlightException {
		if (waitingListNumber == 0) {
			throw new FlightException(1, "Waiting list is empty\n");
		}
		System.out.printf("Searching for passenger...");
		for(int i = 0; i<10; i++) {
			if(waitingList[i].getName().equals(name)) {
				System.out.printf("Passenger was succesfully removed!\n");
				try {
					waitingList[i].setName(" ");
				} catch(FlightException e) {
					e.fix();
				}
				waitingListNumber--;
				return;
			}
		}
		System.out.printf("Passenger not found!\n");
	}
}
