/*
Antony Tejakusuma
CIS 35A
Lab 5
Due Date: 07/28/2016
Submission Date: 07/29/2016
*/

package util;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.*;
import exception.FlightException;
import flight.Flight;

public class FileIO {

	/**
	* Write to file
	*
	* @param airplane plane to be written
	*/
	public static void writeFile(Flight airplane){
		try{
	      	FileOutputStream out = new FileOutputStream("lab5.dat");
	      	ObjectOutputStream objectOut = new ObjectOutputStream(out);    
	      	objectOut.writeObject(airplane);
	        objectOut.close();
	      } catch(Exception e) {  
	      	System.out.print("Error: " + e);
	        System.exit(1);
	      }
	}

	// read from file
	public static Flight readFile() {
		try{
			ObjectInputStream in =  new ObjectInputStream(new FileInputStream("lab5.dat"));
			Flight airplane = (Flight) in.readObject();
			return airplane;
		} catch(Exception e) {
			System.out.printf("Input error!");
			System.exit(1);
		}
		return null;
	}
}



