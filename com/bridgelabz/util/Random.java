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
public class Random  {
  public static void main (String[] args)  {
     int n=Integer.parseInt(args[0]);
     int i=Integer.parseInt(args[1]);
     for(i=0;i<n;i++)
     {
        System.out.println(Math.random());
  


     }

    
       }

   
}