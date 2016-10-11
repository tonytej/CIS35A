/*set
Antony Tejakusuma
CIS 35A
Lab 3 Project 2
Due Date: 07/15/2016
Submission Date: 07/15/2016
*/
package ships;
import java.util.*;
public class CargoShip extends Ship {
	private float maxCarryWeight;
	private float maxCargoVolume;
	private String cargoType;

	//initializer constructor
	CargoShip(float value, float value1, String s){
		this.maxCarryWeight = value;
		this.maxCargoVolume = value1;
		this.cargoType = s;
	}

	//print ship report
	public void printShipReport(){
		System.out.printf("Cargo Ship\n");
		System.out.printf("Name: %s\n", getName());
		System.out.printf("Year Made: %d\n", getYearMade());
		System.out.printf("Producer: %s\n", getProducer());
		System.out.printf("Weight: %.0f kg\n", getWeight());
		System.out.printf("Max Carry Weight: %.0f kg\n", maxCarryWeight);
		System.out.printf("Max Cargo Volume: %.0f cubic meter\n", maxCargoVolume);
		System.out.printf("Cargo Type: %s\n\n", cargoType);
	}

}
