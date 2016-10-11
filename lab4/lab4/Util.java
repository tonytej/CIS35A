/*
Antony Tejakusuma
CIS 35A
Lab 4
Due Date: 07/20/2016
Submission Date: 07/21/2016
*/

package lab4;
import java.util.*;
import java.io.*;

public class Util{

	/**
	* Read from file and builds the student array
	*
	* @param filename file to be read
	* @param stu students array to be build
	* @return stu built students array
	*/
	public Student[] readFile(String filename, Student[] stu){
		//build student array
		for(int i = 0; i < stu.length; i++){
			stu[i] = new Student();
		}

		try {
            FileReader input = new FileReader(filename);
			BufferedReader bufferInput = new BufferedReader(input);

			bufferInput.readLine(); // this will skip the first line

			String line;
			int counter = 0, stuCounter = 0, quizCounter = 0;
			int [] quizScores = new int [5];

			while ((line = bufferInput.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
	     		while (st.hasMoreTokens()) {
	     			int x = Integer.parseInt(st.nextToken());
	     			if (counter % 6 == 0){
	     				quizCounter = 0;
	     				stu[stuCounter].setSID(x);
	     				counter ++;
	     			} else {
	     				quizScores[quizCounter] = x;
	     				if (quizCounter == 4){
	     					quizCounter = 0;
	     					stu[stuCounter].setScores(quizScores);
	     					stuCounter++;
	     				}
	     				quizCounter++;
	     				counter++;
	     			}
	     		}
	     	}
	     	
            bufferInput.close();            
        } catch (IOException e) {
			System.out.println("Error: "+e);
        }
        return stu;
	}
}