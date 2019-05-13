package driver;
import exception.*;
import model.Automobile;
import adapter.BuildAuto;

public class Driver2 {
	/*
	 * Function: Test BuildAuto class contains Automobile which extends proxyAutomobile
	 * and 3 interfaces
	 */
	public static void main(String[] args) {
		//test BuildAuto Class with an abstract class and 3 interfaces
		System.out.println("Running in Driver2");
		try{
			Automobile Car = new Automobile(5, "Focus Wagon ZTW", 18455);
			BuildAuto Auto = new BuildAuto();
			Auto.BuildAuto("C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 2_CIS35B\\src\\data.txt", Car);
			Auto.printAuto("Focus Wagon ZTW", Car);
			Auto.updateOptionSetName("Focus Wagon ZTW", "Color", "New Color", Car);
			Auto.updateOptionPrice("Focus Wagon ZTW", "Power Moonroof", "present", 10101, Car);
			Auto.printAuto("Focus Wagon ZTW", Car);
		}catch(CustomException e)
		{
			e.printmyproblem();
		}
	}
}

//					Test Run #1
/*
Running in Driver2
Focus Wagon ZTW   $18455.0
-------------------OPTION SET---------------------------------
Color
Transmission
Brakes/TractionControl
Side Impact Air Bags
Power Moonroof
-----------------OPTION--------------------------------
Fort Knox Gold Clearcoat Metallic
$0.0
Liquid Grey Clearcoat Metallic
$0.0
Infra-Red Clearcoat
$0.0
Grabber Green ClearcoatMetallic
$0.0
Sangria Red Clearcoat Metallic
$0.0
French Blue Clearcoat Metallic
$0.0
Twilight Blue Clearcoat Metallic
$0.0
CD Silver ClearcoatMetallic
$0.0
Pitch Black Clearcoat
$0.0
Cloud 9 White Clearcoat
$0.0

automatic
$0.0
manual
$-815.0

Standard
$0.0
ABS
$400.0
ABS with Advance Trac
$1625.0

present
$350.0
not present
$0.0

present
$595.0
not present
$0.0

Focus Wagon ZTW   $18455.0
-------------------OPTION SET---------------------------------
Color
New Transmission
Brakes/TractionControl
Side Impact Air Bags
Power Moonroof
-----------------OPTION--------------------------------
Fort Knox Gold Clearcoat Metallic
$0.0
Liquid Grey Clearcoat Metallic
$0.0
Infra-Red Clearcoat
$0.0
Grabber Green ClearcoatMetallic
$0.0
Sangria Red Clearcoat Metallic
$0.0
French Blue Clearcoat Metallic
$0.0
Twilight Blue Clearcoat Metallic
$0.0
CD Silver ClearcoatMetallic
$0.0
Pitch Black Clearcoat
$0.0
Cloud 9 White Clearcoat
$0.0

automatic
$0.0
manual
$-815.0

Standard
$999.0
ABS
$400.0
ABS with Advance Trac
$1625.0

present
$350.0
not present
$0.0

present
$595.0
not present
$0.0
 */

//					Test Run #2
/*
Running in Driver2
Focus Wagon ZTW   $18455.0
-------------------OPTION SET---------------------------------
Color
Transmission
Brakes/TractionControl
Side Impact Air Bags
Power Moonroof
-----------------OPTION--------------------------------
Fort Knox Gold Clearcoat Metallic
$0.0
Liquid Grey Clearcoat Metallic
$0.0
Infra-Red Clearcoat
$0.0
Grabber Green ClearcoatMetallic
$0.0
Sangria Red Clearcoat Metallic
$0.0
French Blue Clearcoat Metallic
$0.0
Twilight Blue Clearcoat Metallic
$0.0
CD Silver ClearcoatMetallic
$0.0
Pitch Black Clearcoat
$0.0
Cloud 9 White Clearcoat
$0.0

automatic
$0.0
manual
$-815.0

Standard
$0.0
ABS
$400.0
ABS with Advance Trac
$1625.0

present
$350.0
not present
$0.0

present
$595.0
not present
$0.0

Focus Wagon ZTW   $18455.0
-------------------OPTION SET---------------------------------
New Color
Transmission
Brakes/TractionControl
Side Impact Air Bags
Power Moonroof
-----------------OPTION--------------------------------
Fort Knox Gold Clearcoat Metallic
$0.0
Liquid Grey Clearcoat Metallic
$0.0
Infra-Red Clearcoat
$0.0
Grabber Green ClearcoatMetallic
$0.0
Sangria Red Clearcoat Metallic
$0.0
French Blue Clearcoat Metallic
$0.0
Twilight Blue Clearcoat Metallic
$0.0
CD Silver ClearcoatMetallic
$0.0
Pitch Black Clearcoat
$0.0
Cloud 9 White Clearcoat
$0.0

automatic
$0.0
manual
$-815.0

Standard
$0.0
ABS
$400.0
ABS with Advance Trac
$1625.0

present
$350.0
not present
$0.0

present
$10101.0
not present
$0.0
 */