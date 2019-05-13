package exception;

import java.util.*;

public class Fix1to100 {
	public Fix1to100()
	{
		
	}
	
	/*
	 * Function: asking the user to enter a valid file name
	 * @parameter: none
	 * @return: a String contains the valid file name  
	 */
	public String fixfilename()
	{	
		Scanner input = new Scanner(System.in);
		String userinput = "";
		System.out.println("Please enter a valid file name!");
		System.out.println("Hint: C:\\\\Users\\Tri Doan\\\\eclipse-workspace\\\\Assignment 2_CIS35B\\\\src\\\\data.txt");
		System.out.printf("Enter again here: ");
		userinput = input.nextLine();
		return userinput;

	}
	
	/*
	 * Function: fix error when the CustomException created and called Fix1to100 class
	 * @parameter: none
	 * @return: String telling user what's wrong
	 */
	public String fixerror1()
	{
		return "Wrong input for Option Set size";
	}
	public String fixerror2()
	{
		return "Price of the car should not be less than $0";
	}
	public String fixerror3()
	{
		return "Array Index Out Of Bounds";
	}	
	public String fixerror4()
	{
		return "Null Pointer Exception";
	}
}