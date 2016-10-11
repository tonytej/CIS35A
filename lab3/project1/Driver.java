/*
Antony Tejakusuma
CIS 35A
Lab 3 Project 1
Due Date: 07/15/2016
Submission Date: 07/15/2016
*/
import savings.*;
import java.util.*;
public class Driver {
	public static void main(String[] args) {

		///////////////////////////PART 1///////////////////////////////////////////////////

		//initialize saver1 and saver2
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();

		//initialize savingsBalances
		saver1.setSavingsBalance(2000f);
		saver2.setSavingsBalance(3000f);

		//initialize annualInterestRate
		saver1.modifyInterestRate(0.04f);

		//print initial balance
		System.out.printf("Part 1:\n");
		System.out.printf("Saver1 initial balance: $%.2f\n", saver1.getSavingsBalance());
		System.out.printf("Saver2 initial balance: $%.2f\n", saver2.getSavingsBalance());

		//calculate monthly interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		//print new balances
		System.out.printf("Saver1 New Balance: $%.2f\n", saver1.getSavingsBalance());
		System.out.printf("Saver2 New Balance: $%.2f\n", saver2.getSavingsBalance());

		//modify interest rate
		saver1.modifyInterestRate(0.05f);

		//calculate new monthly interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		//print new monthly interest
		System.out.printf("Saver1 Next Month's Balance: $%.2f\n", saver1.getSavingsBalance());
		System.out.printf("Saver2 Next Month's Balance: $%.2f\n", saver2.getSavingsBalance());

		///////////////////////////PART 2///////////////////////////////////////////////////

		//initialie special savings
		SpecialSavings saver3 = new SpecialSavings();
		SpecialSavings saver4 = new SpecialSavings();

		//initialize savingsBalances
		saver3.setSavingsBalance(2000f);
		saver4.setSavingsBalance(3000f);

		//multiple deposit and withdraws
		saver3.depositBalance(100000);
		saver3.withdrawBalance(50000);
		saver4.depositBalance(1000);
		saver4.withdrawBalance(200);

		//print initial balance
		System.out.printf("\nPart 2:\n");
		System.out.printf("Saver3 initial balance: $%.2f\n", saver3.getSavingsBalance());
		System.out.printf("Saver4 initial balance: $%.2f\n", saver4.getSavingsBalance());

		// calculate monthly interest for special savings
		saver3.calculateMonthlyInterest();
		saver4.calculateMonthlyInterest();

		//print new balances
		System.out.printf("Saver3 New Balance: $%.2f\n", saver3.getSavingsBalance());
		System.out.printf("Saver4 New Balance: $%.2f\n", saver4.getSavingsBalance());

	}

}
