/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/NoSuchMethod.java
 * Execution: java -cp bin com.bridgelabz.util.NoSuchMethod
 *
 * Purpose: To call an undeclared method.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package Naming Style
*/
package com.bridgelabz.util;
   class NoSuchMethod
   static int input1,input2;
       {
            //accepts value from user as an argument.
	    public static void main(String args[]){
	    input1= Integer.parseInt(args[0]);
	    input2=Integer.parseInt(args[1]);
            //prints the output.
	    System.out.println("The values entered are :" +Input1+ " and " +Input2);
	    int Addition=Add();

	}
}
