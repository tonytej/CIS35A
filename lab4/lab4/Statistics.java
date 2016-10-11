/*
Antony Tejakusuma
CIS 35A
Lab 4
Due Date: 07/20/2016
Submission Date: 07/21/2016
*/

package lab4;
import java.util.*;

public class Statistics{
	int [] lowScores = new int[5];
	int [] highScores = new int[5];
	float [] avgScores = new float [5];

	/**
	* Find lowest score of each quiz of students
	*
	* @param a array of students
	*/
	public void findLow(Student [] a){
		for(int i = 0; i < 5; i++){
			int lowestScore = 100;
			for(int j = 0; j < a.length; j++){
				if (a[j].getScores()[i] < lowestScore){
					lowestScore = a[j].getScores()[i];
				}	
			}
			lowScores[i] = lowestScore;
		}
	}

	/**
	* Find highest score of each quiz of students
	*
	* @param a array of students
	*/
	public void findHigh(Student [] a){
		for(int i = 0; i < 5; i++){
			int highestScore = 0;
			for(int j = 0; j < a.length; j++){
				if (a[j].getScores()[i] > highestScore){
					highestScore = a[j].getScores()[i];
				}	
			}
			highScores[i] = highestScore;
		}
	}

	/**
	* Find average score of each quiz of students
	*
	* @param a array of students
	*/
	public void findAvg(Student [] a){
		for(int i = 0; i < 5; i++){
			int sum = 0;
			for(int j = 0; j < a.length; j++){
				sum += a[j].getScores()[i];
			}
			avgScores[i] = sum * 1.0f / a.length;
		}
	}

	//print low scores
	public void printLowScores(){
		System.out.printf("%d\t%d\t%d\t%d\t%d\n", lowScores[0], lowScores[1], lowScores[2], lowScores[3], lowScores[4]);
	}

	//print high scores
	public void printHighScores(){
		System.out.printf("%d\t%d\t%d\t%d\t%d\n", highScores[0], highScores[1], highScores[2], highScores[3], highScores[4]);
	}

	//print average scores
	public void printAvgScores(){
		System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", avgScores[0], avgScores[1], avgScores[2], avgScores[3], avgScores[4]);
	}

	//print summary
	public void printSummary(Student [] stu){
		System.out.printf("Stud\tQ1\tQ2\tQ3\tQ4\tQ5\n");
		for(int i = 0; i < stu.length; i++){
			stu[i].printInfo();
		}
		System.out.printf("\nHigh Score\t");
		printHighScores();
		System.out.printf("Low Score\t");
		printLowScores();
		System.out.printf("Average  \t");
		printAvgScores();
	}
}