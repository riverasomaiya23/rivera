/******************************************************************************
 *  Purpose: to convert the given temperature in celsius to farenheit or vice versa.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

public class Convert {

	public static void main(String[] args) {
	int temperature=Integer.parseInt(args[0]);

 
    System.out.println("Entered value for temperature is" +temperature);
 
    temperatureincelsius = ((temperature- 32)*5)/9;
 
    System.out.println("Temperatue in Celsius = " + temperatureincelsius);
  }
}
	}
}