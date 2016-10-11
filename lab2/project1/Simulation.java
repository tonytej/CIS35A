/*
Antony Tejakusuma
CIS 35A
Lab 2 Project 1
Due date: 
Submission date: 
*/

import java.util.*;

public class Simulation{
	private int headsCounter;
	private int tailsCounter;

	/**
	* Method that simulates the act of tossing a coin
	*
	* @param c1 Coin class that provides the coin to be tossed
	*/
	public void toss(Coin c){
		Random rand = new Random();
		int random = rand.nextInt(2);
		if(random == 0){
			c.setSideUp("heads");
		} else {
			c.setSideUp("tails");
		}
	}

	/**
	* A method that increments an int variable according to the side that is facing up
	*
	* @param side the side that is facing up
	*/
	public void countAppearances(String side){
		if(side == "heads"){
			headsCounter++;
		} else {
			tailsCounter++;
		}
	}

	public void tossTwentyTimes(Coin c){
		for(int i = 0; i < 20; i++){
			toss(c); //toss
			System.out.printf("Side facing up: %s\n", c.getSideUp()); //print the current side facing up
			countAppearances(c.getSideUp()); //increment headsCounter or tailsCounter
		}
	}

	/**
	* Return the private int variable headsCounter
	*
	* @return private string variable headsCounter
	*/
	public int getHeadsCounter(){
		return headsCounter;
	}

	/**
	* Return the private int variable tailsCounter
	*
	* @return private string variable tailsCounter
	*/
	public int getTailsCounter(){
		return tailsCounter;
	}


}