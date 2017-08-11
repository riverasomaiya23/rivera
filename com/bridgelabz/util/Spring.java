/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/Spring.java
 * Execution: java -cp bin com.bridgelabz.util.Spring
 * Purpose: Finds if the entered day falls under spring season or not.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package
package com.bridgelabz.util;
/*
finds if the season is spring or not.
*/
public class Spring {

    public static void main( String[] args) {
    	//accepting the values from the user
        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);
        // checks if the entered value satisfies the condition of falling under spring season.
        //boolean is used to print true or false as an output.
        boolean isSpring=(month==3 && day>=20 && day<=31) || ( month==4 && day>=1 && day<=30) || ( month ==5 && day>=1 && day<=31) || ( month==6 && day>=1 && day<=20);
        //prints the output after checking the condition.
        System.out.println(isSpring);

}

   }