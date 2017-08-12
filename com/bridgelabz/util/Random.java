/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/Random.java
 * Execution: java -cp bin com.bridgelabz.util.Random
 * Purpose: To find the random sequence between integer 0 and 1.
 *
 *  @author  Rivera
 *  @version 1.08-08-2017
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package naming style
*/
package com.bridgelabz.util;
  //finds the random sequence.
  public class Random  {
     public static void main (String[] args)  {
     //accepts the argument from the user.
     int n=Integer.parseInt(args[0]);
     int i=Integer.parseInt(args[1]);
     //initialising the for loop.
     for(i=0;i<n;i++)
     {
     	//prints the random number.
        System.out.println(Math.random());
  


     }

    
       }

   
}