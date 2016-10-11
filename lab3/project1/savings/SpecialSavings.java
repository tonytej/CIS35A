/*
Antony Tejakusuma
CIS 35A
Lab 3 Project 1
Due Date: 07/15/2016
Submission Date: 07/15/2016
*/
package savings;
import java.util.*;
public class SpecialSavings extends SavingsAccount {

	// Calculate monthly interest if balance is more than 10000
	public void calculateMonthlyInterest(){
		if(getSavingsBalance() > 10000){
			setSavingsBalance(getSavingsBalance() + (getSavingsBalance() * 0.1f / 12));
		} else {
			setSavingsBalance(getSavingsBalance() + (getSavingsBalance() * 0.04f / 12));
		}
	}
	
}
