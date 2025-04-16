package com.cognifyz.projects;

import java.util.Scanner;

public class Temperature {
public static  void main(String [] args) {
	
	int choice;
	double Celcious,Farenheit;
	
	Scanner sc=new Scanner(System.in);
	System.out.println(" 1.Farenheit to Celcius\n 2. Celcius to Farenheit\n");
	System.out.println("Enter the Celcius value:");
	Celcious=sc.nextDouble();
	System.out.println("Enter the Farenheit value:");
	Farenheit=sc.nextDouble();
	
	System.out.println("please select any one of conversion ");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1: Farenheit=((9*Celcious)/5)+32;
	
	System.out.println("converted Farenheit temperature is="+Farenheit);
	
case 2: Celcious=(Farenheit-32)*5/9;
	
	System.out.println("converted Celcious temperature is="+Celcious);
	}
}

}
