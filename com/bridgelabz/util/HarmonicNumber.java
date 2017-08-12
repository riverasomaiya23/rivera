/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/HarmonicNumber.java
 * Execution: java -cp bin com.bridgelabz.util.HramonicNumber
 * Purpose: To find the sum of harmonic series.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
/* package naming style
*/
package com.bridgelabz.util;
/* find the sum of harmonic series 
*/
class HarmonicNumber {
	  //creating a method named harmonic.
	  public static double harmonic (int n) {
	    // initialising sum as 0.
	  	double sum=0.0;
	  	for (int i=1;i<=n; i++)
	  	{
	  		//calculates the sum.
	  		sum +=1.0/i;
	  	} return sum;
	  }

	  public static void main (String[] args) {
	  	//initialising the for loop.
	  	for(int i=0;i< args.length; i++)
	  	{
	  		//accepting the values from the user.
	  		int arg=Integer.parseInt(args[i]);
	  		//stores the value of harmonic series.
	  		double value=harmonic(arg);
	  		//prints the sum of harmonic series.
	  		System.out.println(value);
	  	}
	  }
}