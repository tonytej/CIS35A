/*
Antony Tejakusuma
CIS 35A
Lab 1 Project 1
Due date: 7/3/2016
Submission date: 7/2/2016
*/

import java.util.*;
public class lab1proj1 {

	public static void main(String[] args) {
		//quantity variables
		int TVQuantity, VCRQuantity, RCQuantity, CDPQuantity, TRQuantity;
		//price variables
		float TVPrice = 400.00f;
		float VCRPrice = 220.00f;
		float RCPrice = 35.20f;
		float CDPPrice = 300.00f;
		float TRPrice = 150.00f;
		float taxrate = 0.0825f;
		float subtotal, total;
		
		//Scanner object to prompt user
		Scanner prompt = new Scanner(System.in);
		System.out.printf("%s", "Enter the quantity of TVs sold: ");
		TVQuantity = prompt.nextInt(); //record quantity of TVs

		System.out.printf("%s", "Enter the quantity of VCRs sold: ");
		VCRQuantity = prompt.nextInt(); //record quantity of VCRs

		System.out.printf("%s", "Enter the quantity of remote controls sold: ");
		RCQuantity = prompt.nextInt(); //record quantity of remote controls 

		System.out.printf("%s", "Enter the quantity of CD players sold: ");
		CDPQuantity = prompt.nextInt(); //record quantity of CD players

		System.out.printf("%s", "Enter the quantity of tape recorders sold: ");
		TRQuantity = prompt.nextInt(); //record quantity of tape recorders

		//calculate and store subtotal
		subtotal = (TVQuantity * TVPrice) + (VCRQuantity * VCRPrice) + (RCQuantity * RCPrice) + (CDPQuantity * CDPPrice) + (TRQuantity * TRPrice);
		//calculate and store total
		total = subtotal + subtotal * taxrate;

		//display proper output
		System.out.printf("\nQTY\tDESC\t\tPRICE\t\tTOTAL\n");
		System.out.printf("%2d\tTelevision\t$%.2f\t\t$%.2f\n", TVQuantity, TVPrice, TVQuantity * TVPrice);
		System.out.printf("%2d\tVCR\t\t$%.2f\t\t$%.2f\n", VCRQuantity, VCRPrice, VCRQuantity * VCRPrice);
		System.out.printf("%2d\tRemote Control\t$%.2f\t\t$%.2f\n", RCQuantity, RCPrice, RCQuantity * RCPrice);
		System.out.printf("%2d\tCD Player\t$%.2f\t\t$%.2f\n", CDPQuantity, CDPPrice, CDPQuantity * CDPPrice);				
		System.out.printf("%2d\tTape Recorder\t$%.2f\t\t$%.2f\n", TRQuantity, TRPrice, TRQuantity * TRPrice);			

		System.out.printf("\n%37s: $%.2f", "Subtotal", subtotal);
		System.out.printf("\n%38s: $%.2f", "Tax (8.25%%)", subtotal * taxrate);
		System.out.printf("\n%37s: $%.2f\n", "Total", total);

	}

}
