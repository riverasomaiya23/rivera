/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/DoubleOps.java
 * Execution: java -cp bin com.bridgelabz.util.DoubleOps
 *
 * Purpose: To use the mathematical function in program.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package Naming Style
*/
package com.bridgelabz.util;
   public class DoubleOps {
      public static void main(String[] args) {
        //accepts the input from a user as an argument.
        double a=Double.parseDouble(args [0]);
        double b=Double.parseDouble(args [1]);
        double sum=a+b;
        double prod=a*b;
        double quot=a/b;
        double rem=a%b;
        //prints the output.
        System.out.println(a+ "+" +b+ "=" +sum); 
        System.out.println(a+ "*" +b+ "=" +prod);   
        System.out.println(a+ "/" +b+ "=" +quot);
        System.out.println(a+ "%" +b+ "=" +rem);
        //prints the output using math function.
        System.out.println("sin(PI/2)="+Math.sin(Math.PI/2));
        System.out.println("log(e)="+Math.log(Math.E));



}
   }