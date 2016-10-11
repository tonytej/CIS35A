/*
Antony Tejakusuma
CIS 35A
Lab 2 Project 1
Due date: 07/10/2016
Submission date: 07/10/2016
*/

import java.util.*;

public class Coin{
	private String sideUp;

	/**
	* No argument (default) constructor for Coin class that initialize sideUp randomly.
	*/
	Coin(){
		Random rand = new Random();
		int random = rand.nextInt(2);
		if(random == 0){
			this.sideUp = "heads";
		} else {
			this.sideUp = "tails";
		}
	}

	/**
	* Public method to set the private string variable sideUp
	*
	* @param side the string to set sideUp to
	*/
	public void setSideUp(String side){
		this.sideUp = side;
	}

	/**
	* Public method to return the private string variable sideUp
	*
	* @return private string variable sideUp
	*/
	public String getSideUp(){
		return sideUp;
	}
}