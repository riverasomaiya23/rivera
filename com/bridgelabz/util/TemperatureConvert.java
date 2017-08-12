/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/TemperatureConvert.java
 * Execution: java -cp bin com.bridgelabz.util.TemperatureConvert
 *
 * Purpose: To convert the given temperature in farenheit to celcius and vice versa.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package Naming Style
*/
package com.bridgelabz.util;
import java.util.Scanner;
/* conversion of given temperature
*/
  public class TemperatureConvert {
	   public static void main(String[] args) {
           //accept the values from the user in the form of arguments.
		   Scanner scanner= new Scanner(System.in);
	       int TempCel=Integer.parseInt(args[0]);
	       int TempFar=Integer.parseInt(args[1]);
	       System.out.println();
           //prints the user entered values and also specifies if the values are in celsius or farenheit.
           System.out.println("the temperature in Celsius is:"  +TempCel+  "Celsius");
           System.out.println("the temperature in farenheit is:"  +TempFar+  "farenheit");
           System.out.println();
           //gives user a choice to select from the menu.
           System.out.println("MENU");
           System.out.println("1.Celsius to farenheit");
           System.out.println("2.farenheit to Celsius");
           System.out.println();
           //prints the user entered choice.
           System.out.println("Enter your choice");
           int Result= scanner.nextInt();

           System.out.println("the entered choice is : " +Result);

//using switch cases.
switch(Result)
{

    //converts the user entered choice in celcius to farenheit and prints it.
    case 1: int ResultFar=(TempCel*9/5)+32;
    System.out.println("The " +TempCel+ " in Celsius is converted to " +ResultFar+ " in farenheit");
    break;
    //converts the user entered choice in farenheit to celsius and prints it.
    case 2: int ResultCel=(TempFar-32)*5/9;
    System.out.println("The " +TempFar+ " in farenheit is converted to " +ResultCel+ " in Celsius");
    break;
    //if user enters anything other than two choices give default command prints invalid choice  of the user
    default: System.out.println("Invalid choice");
  
}
	}
}