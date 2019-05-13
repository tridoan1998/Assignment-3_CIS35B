/*
Name: Tri Doan
Course: 35B
Assignment: Lab 3
Description: 
Convert Option and OptionSet to Arraylist
Create a LinkedHashMap of Auto in ProxyAuto (use a custom template option).
Due Date: 05/14/2019
Turn in Date: 05/14/2019
 */
package driver;
import model.*;
import util.*;
import exception.*;
import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args){
		System.out.println("Running in Driver");
		boolean error = true;
		String FileName = "C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 3_CIS35B\\src\\data.txt";			
		while(error == true)
		{
			try {
				Automobile Car = new Automobile(5, "Focus Wagon ZTW", 18455);
				FileIO File = new FileIO();
				File.buildAutomotiveObject(FileName, Car);	
				Car.print();
				Car.deleteOptionSet(1);
				Car.deleteOption(0,2);
				System.out.println(Car.findOptionSet("Brakes/TractionControl"));
				System.out.println(Car.findOption("Standard", 3));			
				Car.updateOptionSetName("Root Top", 1);
				Car.updateOptionName("Carbon Fiber",1, 0);
				Car.updateOptionPrice(524, 3,1);
				System.out.println("---------------------------------------------");
				File.Serialize(Car);
				File.Deserialize("file.ser", Car);
				Car.print();
				error = false;
				}
			catch(CustomException e)
			{
				error = true;
				FileName = e.printmyproblem();				
			}
	}
}
}
//					TEST RUN #1
/*

 */

// 					TEST RUN #2
/*

 */