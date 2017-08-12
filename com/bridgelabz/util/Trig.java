/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/Trig.java
 * Execution: java -cp bin com.bridgelabz.util.Trig
 *
 *
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
/*package naming style
*/
package com.bridgelabz.util;
/* the following program illustrates various trignomatric function in math library.
*/
 public class Trig {
    public static void main(String[] args) {
       //accepts the input from the user as an argument converts them into degrees and radians.
       double degrees=Double.parseDouble(args[0]);      
       double radians=Math.toRadians(degrees);
       
      //trignomatric function Math.sin is used.
       double s=Math.sin(radians);
       //prints the output 
       System.out.println("sin("+degrees+")="+s);
       //trignomatric function Math.cos is used.
       double c=Math.cos(radians);
       //prints the output.
       System.out.println("cos("+degrees+")="+c);
       //trignometric function Math.tan is used.
       double t=Math.tan(radians);
       //prints the calculated output.
       System.out.println("tan("+degrees+")="+t);
       System.out.println(s+"/"+c+"="+s/c);
       //stores the result
       Double r=s*s+c*c;
       //prints the result.
       System.out.println(s*s+"+"+c*c+"="+r);
  


    }

}

  
   
   
   