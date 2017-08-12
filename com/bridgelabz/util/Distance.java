/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/Distance.java
 * Execution: java -cp bin com.bridgelabz.util.Distance
 *
 * Purpose: To calculate the distance between points x and y.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package Naming Style
*/
package com.bridgelabz.util;
   //calculates the distance
   public class Distance {
  	   public static void main(String args []) {
  	   	 //accepts the value from the user as an argument.
         double x = Double.parseDouble(args [0]);
         double y = Double.parseDouble(args [1]);
         //calculates the distance
         double dist = Math.sqrt(x*x + y*y);
         //prints the calculated output.
         System.out.println("Distance from ("+x+","+y+") to (0,0) = " +dist);


  	 }
 	  
  }
