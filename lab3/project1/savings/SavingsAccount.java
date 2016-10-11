/*
Antony Tejakusuma
CIS 35A
Lab 3 Project 1
Due Date: 07/15/2016
Submission Date: 07/15/2016
*/
package savings;
import java.util.*;
public class SavingsAccount {
	static float annualInterestRate;
	private float savingsBalance;

	//savingsBalance setter
	protected void setSavingsBalance(float value){
		this.savingsBalance = value;
	}

	//savingsBalance getter
	protected float getSavingsBalance(){
		return savingsBalance;
	}

	// Calculate monthly interest with given formula
	public void calculateMonthlyInterest(){
		savingsBalance += (savingsBalance * annualInterestRate / 12);
	}

	/**
	* Modify the static variable annualInterestRate
	*
	* @param value new value of annualInterestRate
	*/
	static void modifyInterestRate(float value){
		annualInterestRate = value;
	}

	/**
	* Simulate balance deposit
	*
	* @param value value to be depositted
	*/
	public void depositBalance(float value){
		savingsBalance += value;
	}

	/**
	* Simulate balance withdraw
	*
	* @param value value to be withdrew
	*/
	public void withdrawBalance(float value){
		savingsBalance = savingsBalance - value;
	}

}
