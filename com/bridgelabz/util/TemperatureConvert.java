/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/TemperatureConversion.java
 * Execution: java -cp bin com.bridgelabz.util.TemperatureConversion
 * Purpose: to convert the given temperature in Celsius to farenheit or vice versa.
 *
 *  @author  Rivera
 *  @version 1.08-08-2017
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package naming style
*
package com.bridgelabz.util;
 * Purpose: to convert the given temperature in Celsius to farenheit or vice versa.
 *
 *  @author  Rivera
 *  @version 1.08-08-2017
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package naming style

package com.bridgelabz.util;
*/
import java.util.Scanner;
public class TemperatureConvert {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	int TempCel=Integer.parseInt(args[0]);
	int TempFar=Integer.parseInt(args[1]);
	System.out.println();

    System.out.println("the temperature in Celsius is:"  +TempCel+  "Celsius");
    System.out.println("the temperature in farenheit is:"  +TempFar+  "farenheit");
    System.out.println();

    System.out.println("MENU");
    System.out.println("1.Celsius to farenheit");
    System.out.println("2.farenheit to Celsius");
    System.out.println();

    System.out.println("Enter your choice");
    int Result= scanner.nextInt();

    System.out.println("the entered choice is : " +Result);

switch(Result)
{


    case 1: int ResultFar=(TempCel*9/5)+32;
    System.out.println("The " +TempCel+ " in Celsius is converted to " +ResultFar+ " in farenheit");
    break;

    case 2: int ResultCel=(TempFar-32)*5/9;
    System.out.println("The " +TempFar+ " in farenheit is converted to " +ResultCel+ " in Celsius");
    break;

default: System.out.println("Invalid choice");
  
}
	}
}