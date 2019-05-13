package adapter;
//adapter package needed 4 classes 
import model.*;
import java.util.*; 
import exception.*;
import java.io.*;
//calling methods and model and util methods
//setting another layout 
//become your connector between model and util
//model and util is each component that get connected together in proxyAutomobile[
//This class will contain all the implementation of any method declared in the interface.
public abstract class proxyAutomobile{
	//Variable a1 can be used for handling all
	//operations on Automobile as needed by the interfaces
	private static Automobile Car;
	
	/*
	 * Function: Given a text file name a method called BuildAuto can be written to build 
	 * an instance of Automobile. This method does not have to return the Auto instance.
	 * @parameter: filename and an abstract Object class 
	 * @return: null but an Object class with all the data inserted from the text file 
	 */
	public void BuildAuto(String filename, Automobile Car) throws CustomException
	{
		try {
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
			int counter = 0;	
			int index2 = 0;
			int index3 = 0;
			int index4 = 0;
	
			while(!eof)
			{
				counter++;
				String line = buff.readLine();
				 if (line == null)
				 {
					 eof = true;
				 }
	
				 //get OptionSet name
				 else if(counter == 1 || counter == 5 || counter == 9|| counter == 13 || counter == 17)
				 {
					 Car.setNameForOptionSet(line, index2);
					 index2++;
				 }
				 
				 //get array size of options
				 else if(counter == 2 || counter ==6 || counter == 10 || counter == 14 || counter == 18)
				 {
					 if(counter == 2)
					 {
						 int i = Integer.parseInt(line);
							Car.createOption(i, 0);
					 }
					 else if (counter == 6)
					 {
						 int i = Integer.parseInt(line);
							Car.createOption(i, 1);
					 }
					 else if (counter == 10)
					 {
						 int i = Integer.parseInt(line);
							Car.createOption(i, 2);
					 }
					 else if (counter == 14)
					 {
						 int i = Integer.parseInt(line);
							Car.createOption(i, 3);
					 }
					 else if (counter == 18)
					 {
						 int i = Integer.parseInt(line);
							Car.createOption(i, 4);
					 }
				 }
				 
				 //get option name
				 else if(counter == 3 || counter == 7 || counter == 11 || counter == 15 || counter == 19)
				 {
					 int temp = 0;
					 StringTokenizer stringtoken = new StringTokenizer(line, ",");
					 while(stringtoken.hasMoreTokens())
					 {
						String str = stringtoken.nextToken();
						Car.setNameForOption(str, index3, temp);
						 temp++;
					 }
					index3++;
				 }
				 
				 //get option price 
				 else if(counter == 4 || counter == 8 || counter == 12 || counter == 16 || counter == 20)
				 {
					 int temp = 0;
					 StringTokenizer stringtoken = new StringTokenizer(line, ",");
					 while(stringtoken.hasMoreTokens())
					 {
						 String str = stringtoken.nextToken();
						 float i = Float.parseFloat(str);
						 Car.setPriceForOption(i, index4, temp);
						 temp++;
					 }
					 index4++;
				 }
			}
			file.close();
			buff.close();
	
			}catch(ArrayIndexOutOfBoundsException e)
			{
				throw new CustomException(3, "Array Index Out Of Bounds");
	        }
			catch(NullPointerException e)
			{
				throw new CustomException(4, "Null Pointer Exception");
	        }
			catch(IOException e)
			{
				throw new CustomException(5, "File Does Not Existed");
	        }
			catch(NoSuchElementException e)
			{
				throw new CustomException(6, "Array index out of bound");
			}
	}
	
	//This function searches and prints the properties of a given Auto model.
	public void printAuto(String Modelname, Automobile Car)
	{
		if(Car.getName().equals(Modelname))
		{
			Car.print();
		}
		else
		{
			System.out.println("Wrong Model name, will exit the progrram!");
			System.exit(0);
		}
	
	}
	
	//This function searches the Model for a given OptionSet and sets the name of OptionSet to
	//newName.
	public void updateOptionSetName(String Modelname, String OptionSetname, String newName, Automobile Car)
	{
		if(Car.getName().equals(Modelname))
		{
			int index = Car.findOptionSet(OptionSetname);
			Car.updateOptionSetName(newName, index-1);
		}
		else
		{
			System.out.println("Wrong Model name, will exit the progrram!");
			System.exit(0);
		}
	}

	//This function searches the Model for a given OptionSet and Option name, and sets the price to
	//newPrice.
	public void updateOptionPrice(String Modelname, String Optionname, String Option, float newprice, Automobile Car)
	{
		if(Car.getName().equals(Modelname))
		{
			int index1 = Car.findOptionSet(Optionname);
			int index2 = Car.findOption(Option, index1);
			Car.updateOptionPrice(newprice,index1-1, index2-1);
		}
		else
		{
			System.out.println("Wrong Model name, will exit the progrram!");
			System.exit(0);
		}
	}
	
	/*
	 * Function: Fix input from user when they input filename 
	 * @parameter: none
	 * @return: a String filename
	 */
	public String fixfilename()
	{
		//"C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 2_CIS35B\\src\\data.txt"
		System.out.printf("Enter a valid file name:");
		Scanner input = new Scanner(System.in);
		String userinput = input.nextLine();
		return userinput;
	}
	
}
