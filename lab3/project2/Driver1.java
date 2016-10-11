/*
Antony Tejakusuma
CIS 35A
Lab 3 Project 2
Due Date: 07/15/2016
Submission Date: 07/15/2016
*/
import ships.*;
import java.util.*;
public class Driver1 {
	public static void main(String[] args) {
		//initialize array of ships
		Ship s [] = new Ship[3];
		s[0] = new CruiseShip(400, 1500, 3, 900, 7);
		s[1] = new CargoShip(600, 400, "Wheat");
		s[2] = new CruiseShip(200, 900, 4, 1300, 7);

		//initialize each ships
		s[0].setLength(300);
		s[0].setWidth(100);
		s[0].setHeight(20);
		s[0].setWeight(3000);
		s[0].setName("Longclaw");
		s[0].setYearMade(1991);
		s[0].setProducer("Aegon");

		s[1].setLength(350);
		s[1].setWidth(40);
		s[1].setHeight(15);
		s[1].setWeight(2700);
		s[1].setName("Ice");
		s[1].setYearMade(2002);
		s[1].setProducer("Aegon");

		s[2].setLength(440);
		s[2].setWidth(190);
		s[2].setHeight(25);
		s[2].setWeight(4400);
		s[2].setName("Solstice");
		s[2].setYearMade(1973);
		s[2].setProducer("Celebrity");

		//call printShipReport of respective object
		for(int i = 0; i < s.length; i++){
			s[i].printShipReport();
		}

	}

}
