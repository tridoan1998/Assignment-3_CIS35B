package adapter;

//Whenever a new interface has to be added, you can simply update BuildAuto declaration 
//and write all methods in Abstract class called proxyAutomobile

/*
 BuildAuto works as an adapter. proxyAutomobile class will contain all the methods implementations 
 while CreateAuto, UpdateAuto, FixAuto class will contain all the methods definition.
 */
public class BuildAuto extends proxyAutomobile implements CreateAuto, UpdateAuto, FixAuto{
	
	
	
}
