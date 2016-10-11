/*
Antony Tejakusuma
CIS 35A
Lab 4
Due Date: 07/20/2016
Submission Date: 07/21/2016
*/

import lab4.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		//initialize student array
		Student[] a = new Student[15];
		//initialize Util class
		Util u = new Util();
		a = u.readFile("input.txt", a);
		
		//Do statistics
		Statistics stat = new Statistics();
		stat.findLow(a);
		stat.findHigh(a);
		stat.findAvg(a);

		//output
		stat.printSummary(a);
	}	
}