/******************************************************************************
 * 
 * Compilation: javac -d bin com/bridgelabz/util/Loan.java
 * Execution: java -cp bin com.bridgelabz.util.Loan
 *
 * Purpose: to calculate the rate of interest on the loan
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
/*
*Find the rate of interest on the loan
*/
class Loan {

	public static void main(String[] args) {


       //Accepting values from user 
       double principle = Integer.parseInt(args[0]); 
       double year = Integer.parseInt(args[1]); 
       double rateOfInterest = Integer.parseInt(args[2]); 

		   //Calculates the numbere of months
       double n = 12 * year;


       //Calculates the rate of intrest
       double rof = rateOfIntreast/(12 * 100);

       //calculating the denominator
		   double k = 1 + rof;
		   double p = Math.pow(k,-n);

		  //Simplifying the solution into two variables i.e Numerator and Denomintor
       double denominator = 1 - p;
       double numerator = principle * rof;

        //Calculating the loan
        double loanPerMonth = numerator/denominator;
        //prints the amount to be paid as an interest on the loan taken.
		    System.out.println("Rs."+loanPerMonth+" to be paid every month");
	}
}		