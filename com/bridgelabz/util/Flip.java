/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/Flip.java
 * Execution: java -cp bin com.bridgelabz.util.Flip
 *
 * Purpose: To flip a coin and observe the output.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
/*package Naming Style
*/
package com.bridgelabz.util; 
  class Flip {
     public static void main( String[] args) {
       if(Math.random()<0.5) {
        //prints heads.
        System.out.println("Heads");
	}
        else{
          //prints the tails.
        System.out.println("tails");   
	    } 
    }
  }

	1