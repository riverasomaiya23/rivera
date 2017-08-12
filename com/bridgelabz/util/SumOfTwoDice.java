/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/SumOfTwoDice.java
 * Execution: java -cp bin com.bridgelabz.util.SumOfTwoDice
 *
 * Purpose: To calculate the sum of two dice.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package Naming Style
*/
package com.bridgelabz.util;
    public class SumOfTwoDice {
       public static void main(String args []) {
       //accepts the input from the user as an argument.
       int dice1 = Integer.parseInt(args [0]);
       int dice2 = Integer.parseInt(args [1]);
       //prints the user entered value.
       System.out.println("The number of values required from dice1 is : " +dice1);
       System.out.println("The number of values required from dice2 is : " +dice2);
       //initialising the for loop. 
       for(int i=0;i<dice1;i++) {
       for(int j=0;j<dice2;j++) {
       double result1 = Math.random()*6+1;
       double result2 = Math.random()*6+1;
       //prints the value of two dice when thrown.
       System.out.println("Value for dice1 is : " +result1);
       System.out.println("Value for dice2 is : " +result2);
       Double Sum = result1 + result2;
       //prints the result of two dice.
       System.out.println("The sum of two dice is : " +Sum);

}
}
}
}