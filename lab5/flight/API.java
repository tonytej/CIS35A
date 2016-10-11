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

public interface API {
	public void addPeople(Flight plane) throws FlightException;
	public void removePeople(Flight plane, String name);
	public void removePeopleWaitList(Flight plane, String name);
}
