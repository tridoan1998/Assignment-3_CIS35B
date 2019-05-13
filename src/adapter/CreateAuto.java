package adapter;
import model.*;
import exception.CustomException;


/*
 * Function: interface used to implements methods for Automobile 
 */
public interface CreateAuto {
	public void BuildAuto(String filename, Automobile Car) throws CustomException;
	public void printAuto(String Modelname, Automobile Car);
}
