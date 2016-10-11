/*
Antony Tejakusuma
CIS 35A
Lab 3 Project 2
Due Date: 07/15/2016
Submission Date: 07/15/2016
*/
package ships;
import java.util.*;
public class Ship {
	private float length, width, height, weight;
	private String name, producer;
	private int yearMade;

	//length setter
	public void setLength(float value){
		this.length = value;
	}
	//width setter
	public void setWidth(float value){
		this.width = value;
	}
	//height setter
	public void setHeight(float value){
		this.height = value;
	}
	//weight setter
	public void setWeight(float value){
		this.weight = value;
	}
	//name setter
	public void setName(String s){
		this.name = s;
	}
	//producer setter
	public void setProducer(String s){
		this.producer = s;
	}
	//year made setter
	public void setYearMade(int n){
		this.yearMade = n;
	}
	//length getter
	public float getLength(){
		return length;
	}
	//width getter
	public float getWidth(){
		return width;
	}
	//height getter
	public float getHeight(){
		return height;
	}
	//weight getter
	public float getWeight(){
		return weight;
	}
	//name getter
	public String getName(){
		return name;
	}
	//producer getter
	public String getProducer(){
		return producer;
	}
	//year made getter
	public int getYearMade(){
		return yearMade;
	}
	//print ship report
	public void printShipReport(){
		System.out.printf("Ship\n");
		System.out.printf("Name: %s\n", name);
		System.out.printf("Year Made: %d\n", yearMade);
		System.out.printf("Producer: %s\n", producer);
		System.out.printf("Weight: %.0f kg\n", weight);
		System.out.printf("Length: %.0f m\n", length);
		System.out.printf("Width: %.0f m\n", width);
		System.out.printf("height: %.0f m\n\n", height);
	}

}
