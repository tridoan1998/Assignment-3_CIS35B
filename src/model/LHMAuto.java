package model;

/*
key = make+model+year
LHM object is static
making a template and adding a new class in model package and instantiating the template
in ProxyAuto
*/

public class LHMAuto <T extends Automobile>{
	private T t;
	public LHMAuto(){
		
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;

		
		//methods for adding, removing, finding, deleting an auto
		//check for available LHM built in library
		
}
}
