/*****************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/LeapYear.java
 * Execution: java -cp bin com.bridgelabz.util.LeapYear
 *
 * Purpose: Finds if the year entered is leap year or not.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util
  public class LeapYear {
     public static void main( String[] args) {
     	//accepts the value from a user as an argument.
       int year=Integer.parseInt(args[0]);
       //boolean is used to state true or false based on users input.
       boolean IsLeapYear;
       //divisible by four.
       IsLeapYear = (year%4==0);
       //divisible by 4 and not 100.
       IsLeapYear = IsLeapYear && (year%100!=0);
       //divisible by 400.
       IsLeapYear = IsLeapYear || (year%400==0);
       //prints if the year is leap year or not.
       System.out.println(IsLeapYear);
   }
}   