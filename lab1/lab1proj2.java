/*
Antony Tejakusuma
CIS 35A
Lab 1 Project 2
7/3/2016
7/2/2016
*/

import java.util.*;
public class lab1proj2 {
	/**
	* Convert centigrade temperature to fahrenheit and print it
	*
	* @param temp temperature to be converted
	*/
	static void convertCtoFandPrint(float temp){
		float newtemp = 32f + temp * (180.0f/100.0f);
		System.out.printf("%.1f C is equivalent to %.1f F\n", temp, newtemp);
	}

	/**
	* Convert fahrenheit temperature to centigrade and print it
	*
	* @param temp temperature to be converted
	*/
	static void convertFtoCandPrint(float temp){
		float newtemp = (temp - 32f) * (100.0f/180.0f);
		System.out.printf("%.1f F is equivalent to %.1f C\n", temp, newtemp);
	}

	public static void main(String[] args) {
		//variable to store inputted temperature
		float temp;
		//Scanner object to prompt user
		Scanner prompt = new Scanner(System.in);
		System.out.printf("%s","Enter a temperature in Centigrade: ");
		temp = prompt.nextFloat(); //record temperature
		convertCtoFandPrint(temp); //call the appropriate function

		System.out.printf("%s","Enter a temperature in Fahrenheit: ");
		temp = prompt.nextFloat(); //record temperature
		convertFtoCandPrint(temp); //call the appropriate function


	}

}
