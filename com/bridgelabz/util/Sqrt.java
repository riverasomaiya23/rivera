/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/Sqrt.java
 * Execution: java -cp bin com.bridgelabz.util.Sqrt
 *
 * Purpose: To compute square root of negative number.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
  //computes the square root of negative number.
  public class Sqrt {
     public static void main (String[] args) {
     //accepts the input from the user.
     double c=Double.parseDouble(args[0]);
     //relative error tolerance.
     double epsilon=1e-15;
     //estimate square root of c
     double t=c;
     //initialising the while loop.
     while(Math.abs(t-c/t)>epsilon*t)
   {
     t=(c/t+t)/2.0;
   }

   System.out.println(t);

  }
}
       


