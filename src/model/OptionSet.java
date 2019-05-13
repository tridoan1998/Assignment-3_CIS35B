package model;

import java.io.Serializable;
import java.util.*;

public class OptionSet implements Serializable{
	//stop the serializable class does not declare
    private static final long serialVersionUID = 1L;
    private Option choice;
    private ArrayList<Option> opt;
	private String name;
	  
	//default constructor
	  protected OptionSet()
	  {
	  }
	  
	  protected OptionSet(String n, int size)  
	  {
		  for(int i=0; i < size; i++)    
		  {  
			Option option = new Option();
			opt.add(option); 
		  }	  
		  name = n;
	  }
	  
	  public class Option implements Serializable
	  {  
		  //stop the serializable class does not declare
	      private static final long serialVersionUID = 1L;
	      private String name;
		  private float price;
		  
		  protected Option()
		  {
		  }
		  protected Option(String n, float p)
		  {
			  name = n;
			  price = p;
		  }
		  
		  //Getter and Setter for Option
		  protected String getName() {
			  return name;
		  }
		  protected void setName(String name) {
			this.name = name;
		}
		  protected float getPrice() {
			return price;
		}
		  protected void setPrice(float price) {
			this.price = price;
		}
	  }

	  //Getter and setter for OptionSet

	  protected String getName() {
		return name;
	}
	  public Option getChoice() {
		return choice;
	}

	public void setChoice(Option choice) {
		this.choice = choice;
	}

	public ArrayList<Option> getOpt() {
		return opt;
	}

	public void setOpt(ArrayList<Option> opt) {
		this.opt = opt;
	}

	protected void setName(String name) {
		this.name = name;
	}
	


	  
	  
}
