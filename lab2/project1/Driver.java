/*
Antony Tejakusuma
CIS 35A
Lab 2 Project 1
Due date: 07/10/2016
Submission date: 07/10/2016
*/

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		//initializes the coin and simulation classes
		Coin c = new Coin();
		Simulation sim = new Simulation();
		//print initial side facing up
		System.out.printf("Initial side facing up: %s\n", c.getSideUp());
		//toss coin 20 times
		sim.tossTwentyTimes(c);
		//display heads and tails count
		System.out.printf("Heads appeared %d times\n", sim.getHeadsCounter());
		System.out.printf("Tails appeared %d times\n", sim.getTailsCounter());
	}

}
