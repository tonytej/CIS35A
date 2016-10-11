/*
Antony Tejakusuma
CIS 35A
Lab 2 Project 2
Due date: 
Submission date: 
*/

import java.util.*;

public class ParkedCar {
	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private int minutesParked;

	//make setter
	public void setMake(String m){
		this.make = m;
	}
	//model setter
	public void setModel(String m){
		this.model = m;
	}
	//color setter
	public void setColor(String c){
		this.color = c;
	}
	//license number setter
	public void setLicenseNumber(String l){
		this.licenseNumber = l;
	}
	//minutes parked setter
	public void setMinutesParked(int m){
		this.minutesParked = m;
	}
	//make getter
	public String getMake(){
		return make;
	}
	//model getter
	public String getModel(){
		return model;
	}
	//color getter
	public String getColor(){
		return color;
	}
	//license number getter
	public String getLicenseNumber(){
		return licenseNumber;
	}
	//minutes parked getter
	public int getMinutesParked(){
		return minutesParked;
	}
}