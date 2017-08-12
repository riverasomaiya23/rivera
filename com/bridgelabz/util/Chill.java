/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/TemperatureConvert.java
 * Execution: java -cp bin com.bridgelabz.util.TemperatureConvert
 *
 * Purpose: Finds the chill in the temperature
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   07-08-2017
 *
 *****************************************************************************/
/*package Naming Style
*/
package com.bridgelabz.util;
    //finds the chill in the temperature.
    class Chill {
       public static void main(String[] args) {
   	   //t and v variable stores the temperature and speed
       int temp= Integer.parseInt(args[0]);
       int velocity= Integer.parseInt(args[1]);
       //prints temperature and speed 
       System.out.println("The entered values for temperature is "+ temp +"and velocity is "+velocity);
       //variable w stores the calculated chill/
       //math is used to calculate power
       double w = 35.74+0.6315*temp+(0.4277*temp-35.75)*Math.pow(velocity,0.16);
      //prints the calculated Chill
      System.out.println("The wind chill is:"+w);
 
}
    
  }
