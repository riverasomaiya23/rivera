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
package com.bridgelabz.util; 
import java.lang.Integer;
  //class declaration
  class Flip 
  {
  static int flipTimes;
  static int headTimes=0;
  static int tailTimes=0;
  static int headsPercent;
  static int tailsPercent;
  static int totalTimes;
  static int ctr;
     
       public static void main( String[] args)
         { 
           flipTimes=Integer.parseInt(args[0]);
           System.out.println("number of times the coin is flipped is" +flipTimes);
         for(ctr=1;ctr<=flipTimes;ctr++)
          {
             if(Math.random()<0.5) 
              {
                headTimes++;
	          }
            else
               {
                 tailTimes++;
               }
                 totalTimes++;
          }
                   System.out.println("number of  heads appeared is" +headTimes+ 
					"where number of tails are " +tailTimes);

                   headsPercent=(headTimes*100)/totalTimes;
                   tailsPercent=(tailTimes*100)/totalTimes;

                   System.out.println("percent of the heads appear is" +headsPercent+ 
					"where as percent of tails appear is" +tailsPercent);
	         }
          }  
   
 

	
