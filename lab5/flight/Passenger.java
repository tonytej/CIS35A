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

public class Passenger implements Serializable{
	private String name;

	//name getter
	public String getName(){
		return name;
	}

	//name setter
	public void setName(String name) throws FlightException{
		if(name.equals("")){
			throw new FlightException(1, "Name cannot be blank, please use valid input\n\n");
		}
		this.name = name;
	}
}
