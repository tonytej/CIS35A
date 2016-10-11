/*
Antony Tejakusuma
CIS 35A
Lab 5
Due Date: 07/28/2016
Submission Date: 07/29/2016
*/

package exception;
import java.util.*;

public class FlightException extends Exception {
	 int error;
     String desc;

     public FlightException(int error, String desc) { 
	   this.error = error;
   	   this.desc = desc;
     }
     
     public void fix() {
	   	switch(error) {
	       	case 1:fixOne();break;
	   	}
     }

     public void fixOne() {
       System.out.printf("%s", desc);
     }
}
