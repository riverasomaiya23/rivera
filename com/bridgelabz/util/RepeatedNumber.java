/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/RepeatedNumber.java
 * Execution: java -cp bin com.bridgelabz.util.RepeatedNumber
 *
 * Purpose: To find the Repeated number.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package Naming Style
*/
package com.bridgelabz.util;
/* finds the repeated number.
*/
public class RepeatedNumber{
   public static void main( String[] args) {
      //declaring an array of a[8] with a repeated Number.
   	 int arr[]= { 1,2,3,4,5,3,6,7,8};
       //initialising of for loop.
   	 for (int i=0;i<arr.length-1;i++)
   	 {
   	 	for (int j=i+1; j<arr.length; j++)
   	 	{
   	 		if(arr[i]==arr[j])
   	 	    
   	 		{  //prints the repeated number.
   	 			System.out.println("Repeated number is:" +arr[j]);
   	 		}
   	 	}
   	 }

}
}    