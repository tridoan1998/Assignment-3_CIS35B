package model;
import java.io.*;
import exception.*;
import java.util.*;
import model.OptionSet.*;
//import util.*;
public class Automobile implements Serializable{
	//stop the serializable class does not declare
    private static final long serialVersionUID = 1L;
   
	private String name;
	private float baseprice;

	private OptionSet choice;
	private ArrayList<OptionSet> opset;
	
	//don't need default constructor because no model should be zero
	
	//constructor to initialize object 
	public Automobile(int size, String n, float b) throws CustomException
	 {
		this.opset = new ArrayList<OptionSet>();
		
		this.name = n;
		this.baseprice = b;
		for(int i=0;i<size;i++)
		{
			OptionSet optionSet = new OptionSet();
			this.opset.add(optionSet);
		}
		if(size < 0)
		{
			throw new CustomException(1, "Wrong input for Option Set size");
		}
		if(b < 0)
		{
			throw new CustomException(2,"Price of the car should not be less than $0");
		}
	 }
	
	//Getter and Setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public OptionSet getChoice() {
		return choice;
	}

	public void setChoice(OptionSet choice) {
		this.choice = choice;
	}

	public ArrayList<OptionSet> getOpset() {
		return opset;
	}

	public void setOpset(ArrayList<OptionSet> opset) {
		this.opset = opset;
	}

	public float getBaseprice() {
		return baseprice;
	}
	public void setBaseprice(float baseprice) {
		this.baseprice = baseprice;
	}
	
	/*
	 * Function: to create Option array within each OptionSet array
	 * Parameter: int size of the Option array, and index of the OptionSet
	 * Return: void, an Option array created under the given OptionSet
	 */
	public void createOption(int size, int index)
	{
		ArrayList<Option> a = new ArrayList<Option>();
		for(int i = 0; i < size; i++)
		{
			Option o = this.opset.get(index).new Option();
			a.add(o);
		}
		this.opset.get(index).setOpt(a);
	}
	
	//Getter and Setter for OptionSet and Option
	public void setNameForOptionSet(String name, int index)
	{
		this.opset.get(index).setName(name);
	}
	
	public String getNameForOptionSet(int index)
	{
		return this.opset.get(index).getName();
	}
	
	public void setNameForOption(String name, int index2, int temp)
	{
		this.opset.get(index2).getOpt().get(temp).setName(name);
	}
	
	public String getNameForOption(int index1, int index2)
	{
		return this.opset.get(index1).getOpt().get(index2).getName();
	}
	
	public void setPriceForOption(float name, int index1, int index2)
	{
		this.opset.get(index1).getOpt().get(index2).setPrice(name);
	}
	
	public float getPriceForOption(int index1, int index2)
	{
		return this.opset.get(index1).getOpt().get(index2).getPrice();
	}
	
	
	/*
	 * Function: print out all the Option in every OptionSet in the Car object
	 * Parameter: none
	 * Return type: void  
	 */
	public void print()
	{		
		//System.out.println(this.opset.get(0).getOpt().size());
		System.out.println(getName() + "   $"+  getBaseprice());
		System.out.println("-------------------OPTION SET---------------------------------");
		
        // ListIterator to traverse the list 
		ListIterator<OptionSet> OptionSet = this.opset.listIterator();
		while(OptionSet.hasNext())
		{	
			System.out.println(OptionSet.next().getName());
		}	
		System.out.println("-----------------OPTION--------------------------------");
		//ListIterator<OptionSet> Option = this.opset.listIterator();
		int index = 0;
		for(int i = 0; i < this.opset.size();i++)
		{
			System.out.println(index);
			//create the iterator with the option under specific index 
			ListIterator<Option> Opt = this.opset.get(index).getOpt().listIterator();
			while(Opt.hasNext())
			{
				int temp = Opt.nextIndex();
				System.out.println(this.opset.get(index).getOpt().get(temp).getName());
				System.out.println("$" + Opt.next().getPrice());
			}			
			index++;
		}	
	}
	
	/*
	 * Function: delete one OptionSet and set it to null
	 * Parameter: index of the OptionSet array
	 * Return: void
	 */
	public void deleteOptionSet(int index)
	{
		this.opset.remove(index);
	}
	
	/*
	 * Function: delete one of the option under given OptionSet
	 * Parameter: index of OptionSet and Option want to delete
	 *  Return: void
	 */
	public void deleteOption(int index1, int index2)
	{
		this.opset.get(index1).getOpt().remove(index2);
	}
	
	/*
	 * Function: Find the OptionSet in the Car object
	 * Parameter: a String to search for it in the OptionSet
	 * Return: the index of the OptionSet array hold the String value 
	 */
	public int findOptionSet(String name)
	{
		int index = 0;
		ListIterator<OptionSet> iterator = this.opset.listIterator();
		while(iterator.hasNext())
		{
			if(iterator.next().getName().contains(name))
			{
				return index+1;
			}
			index++;
		}
		return -1;
	}
	
	/*
	 *Function: find if one Option existed in the Option array 
	 *Parameter: a String of Option to search for and the index of the OptionSet array
	 *Return: the index of where that Option is at in the given OptionSet array   
	 */
	public int findOption(String name, int index)
	{	
		int index1 = 0;
		ListIterator<Option> iterator = this.opset.get(index).getOpt().listIterator();
		while(iterator.hasNext())
		{
			if(iterator.next().getName().contains(name))
			{
				return index1+1; 
			}
			index1++;
		}
		return -1;
	}
	
	/*
	 * Function: update the OptionSet name to a new name
	 * Parameter: a String and an index 
	 * Return: void, name of the OptionSet should be updated
	 */
	public void updateOptionSetName(String newname, int index)
	{
		this.opset.get(index).setName(newname);
	}
	
	/*
	 * Function: update Option Name to a new one
	 * Parameter: a String for new name, index of the OptionSet and index of Option
	 * Return: void 
	 */
	public void updateOptionName(String name, int index1, int index2)
	{
		this.opset.get(index1).getOpt().get(index2).setName(name);
	}
	
	/*
	 * Function: update Option Price with a new price 
	 * Parameter: float new price to update, index of OptionSet and index of Option 
	 * Return: void 
	 */
	public void updateOptionPrice(float newprice, int index1, int index2)
	{
		this.opset.get(index1).getOpt().get(index2).setPrice(newprice);
	}
}