/*
Antony Tejakusuma
CIS 35A
Lab 4
Due Date: 07/20/2016
Submission Date: 07/21/2016
*/
package lab4;
import java.util.*;

public class Student{
	private int SID;
	private int scores[] = new int[5];
	
	//SID setter
	public void setSID(int n){
		this.SID = n;
	}

	//Scores setter
	public void setScores(int [] q){
		for(int i = 0; i < scores.length; i++){
			scores[i] = q[i];
		}
	}

	//SID getter
	public int getSID(){
		return SID;
	}

	//Scores getter
	public int[] getScores(){
		return scores;
	}

	//print student's info
	public void printInfo(){
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", SID, scores[0], scores[1], scores[2], scores[3], scores[4]);
	}


}