/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/Triangle.java
 * Execution: java -cp bin com.bridgelabz.util.Triangle
 *
 * Purpose: To calculate area of triangle.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
/*package Naming Style
*/
package com.bridgelabz.util;
/* finds area of triangle.
*/
    public class Triangle 
       {
       public static void main(String args[])
       {
       //accepts the input from the user as an argument.
       double side1 = Double.parseDouble(args[0]);
       double side2 = Double.parseDouble(args[1]);
       double side3 = Double.parseDouble(args[2]);
       System.out.println("The value of sides of a triangle entered are as follows: a.) "+side1+" , b.) "+side2+" , c.) " +side3);   
       double s = (side1+side2+side3)/2;
       double a = s-side1; 
       double b = s-side2;
       double c = s-side3;
       //calculates the area of triangle.
       double AreaOfTriangle = Math.sqrt(s*(a*b*c));
       //prints the calculated area of triangle
       System.out.println("The area of the triangle obtained is" +AreaOfTriangle);
    }

}
