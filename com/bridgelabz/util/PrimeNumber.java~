/*******************************************************
* Purpose: To know if the number is prime number or not.

@author; Rivera
@since;  06/08/2017
********************************************************/

/*
 * PACKAGE NAME
*/
package com.bridgelabz.util;

// IMPORT STATEMENtS
import java.util.Scanner;

// CLASS DECLARATION 
 public class PrimeNumber {

 	       //The main function is written to test PrimeNumber class
               public static void main(String args[]) {			
		/*************************************************
                 mInputNo variable stores the number entered by the user as the input
		 mIsPrime variable stores if the number is prime or not
                 *************************************************/
		 int mInputNo,mIsPrime;
               // Scanner takes the input from the system and allocates the memory.
	       Scanner scanner=new Scanner(System.in);
	       System.out.println("enter the input number");
	       mInputNo=scanner.nextInt();
	       for(mIsPrime=2;mIsPrime<mInputNo;mIsPrime++);{
                  // if it divides evenly divides it is not a prime, so break out of loop
	           if(mInputNo%mIsPrime==0) {
				System.out.println("not a prime number");
				break;
			}
		}
// retrun string based on the mInputNumber is prime or not
if(mIsPrime==mInputNo){
       System.out.println("is a prime number");

}
}
}
