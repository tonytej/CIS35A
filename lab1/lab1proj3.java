/*
Antony Tejakusuma
CIS 35A
Lab 1 Project 3
Due date: 7/3/2016
Submission date: 7/2/2016
*/

import java.util.*;
import java.io.Console;
public class lab1proj3 {
		/**
		* Calculate depreciation using the straight line method and print each iteration
		*
		* @param desc item description
		* @param purchaseyear year of purchase of the item
		* @param cost cost of the item
		* @param estlife estimated life of the item
		* @param depmethod method of depreciation
		*/
	    public static void StraightLineDep(String desc, float purchaseyear, float cost, float estlife, String depmethod){
	    	System.out.printf("\n%s: %s\n", "Description", desc);
	    	System.out.printf("%s: %.0f\n", "Year of Purchase", purchaseyear);
	    	System.out.printf("%s: %.0f\n", "Cost", cost);
	    	System.out.printf("%s: %.0f\n", "Estimated Life", estlife);
	    	System.out.printf("%s: %s\n", "Method of Depreciation", depmethod);
	    	System.out.printf("%s\t%s\t\t%s\t%s\n", "Year", "Cost", "Dep. Amt", "Tot Dep.");
	    	float yearlimit = purchaseyear + estlife;
	    	float totaldep = 0;
	    	float depamt = 0;
	    	while(purchaseyear < yearlimit){
	    		System.out.printf("%.0f\t", purchaseyear);
	    		System.out.printf("%,8.2f\t", cost);
	    		depamt = cost * (1/estlife);
	    		System.out.printf("%,8.2f\t", depamt);
	    		totaldep += depamt;
	    		System.out.printf("%,8.2f\n", totaldep);
	    		purchaseyear++;
	    	}
	    }

	    /**
		* Calculate depreciation using the double declining method and print each iteration
		*
		* @param desc item description
		* @param purchaseyear year of purchase of the item
		* @param cost cost of the item
		* @param estlife estimated life of the item
		* @param depmethod method of depreciation
		*/
	    public static void DoubleDep(String desc, float purchaseyear, float cost, float estlife, String depmethod){
	    	System.out.printf("\n%s: %s\n", "Description", desc);
	    	System.out.printf("%s: %.0f\n", "Year of Purchase", purchaseyear);
	    	System.out.printf("%s: %.0f\n", "Cost", cost);
	    	System.out.printf("%s: %.0f\n", "Estimated Life", estlife);
	    	System.out.printf("%s: %s\n", "Method of Depreciation", depmethod);
	    	System.out.printf("%s\t%s\t\t%s\t%s\n", "Year", "Cost", "Dep. Amt", "Tot Dep.");
	    	float yearlimit = purchaseyear + estlife;
	    	float totaldep = 0;
	    	float depamt = 0;
	    	while(purchaseyear < yearlimit){
	    		System.out.printf("%.0f\t", purchaseyear);
	    		System.out.printf("%,8.2f\t", cost);
	    		if(purchaseyear == yearlimit - 1f){
	    			depamt = cost;
	    		} else {
	    			depamt = cost * (2/estlife);
	    		}
	    		System.out.printf("%,8.2f\t", depamt);
	    		totaldep += depamt;
	    		System.out.printf("%,8.2f\n", totaldep);
	    		cost -= depamt;
	    		purchaseyear++;
	    	}
	    }

	    public static void main(String [] args){
	    	//declare required variables
		    String desc, depmethod;
		    float purchaseyear, cost, estlife;
		    //Scanner object to prompt user
		    Scanner prompt = new Scanner(System.in);
			System.out.printf("%s","Enter description of the item: ");
			desc = prompt.next(); //record item description

			System.out.printf("%s","Enter the year of purchase: ");
			purchaseyear = prompt.nextFloat(); //record year of purchase of the item

			System.out.printf("%s","Enter the cost of the item: ");
			cost = prompt.nextFloat(); //record the cost of the item

			System.out.printf("%s","Enter estimated life of the item: ");
			estlife = prompt.nextFloat(); //record the estimated life of the item

			Console console = System.console();
			depmethod = console.readLine ("Enter depreciation method: "); //record the depreciation method

			if (depmethod.equals("Straight-Line")){ //decision construct to decide which functions to call
				StraightLineDep(desc, purchaseyear, cost, estlife, depmethod); //call the StraightLineDep if the user opts for it
			} else {
				DoubleDep(desc, purchaseyear, cost, estlife, depmethod); //call the DoubleDecliningDep if the user opts otherwise
			}
		}	
}
