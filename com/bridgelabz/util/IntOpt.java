/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/IntOpt.java
 * Execution: java -cp bin com.bridgelabz.util.IntOpt
 *
 * Purpose: To calculate math formulae.

 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package Naming Style
*/
package com.bridgelabz.util;
  public class IntOpt {
    public static void main (String args[]) {
      //accepts the input from the user.
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      double c = Double.parseDouble(args[2]);
      //prints the user entered values.
      System.out.println("The entered values are as follows : "+a+" , "+b+" , " +c);
      //calculates math formulae.
      double result1 = a + b * c;
      double result2 = a * b + c;
      double result3 = c + a / b;
      double result4 = a % b + c;
      //prints the obtained result.
      System.out.println(" Result for "+a+" + "+b+" * "+c+" = " +result1);
      System.out.println(" Result for "+a+" * "+b+" + "+c+" = " +result2);
      System.out.println(" Result for "+a+" + "+b+" / "+c+" = " +result3);
      System.out.println(" Result for "+a+" % "+b+" + "+c+" = " +result4);
    }
}
