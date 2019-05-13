package adapter;

import model.Automobile;

/*
 * Function: interface used to implements methods for Automobile 
 */
public interface UpdateAuto {
	public void updateOptionSetName(String Modelname, String OptionSetname, String newName, Automobile Car);
	public void updateOptionPrice(String Modelname, String Optionname, String Option, float newprice, Automobile Car);
	

}
