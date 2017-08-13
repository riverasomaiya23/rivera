/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/PrimeRange.java
 * Execution: java -cp bin com.bridgelabz.util.PrimeRange
 *
 * Purpose: To find the prime numbers between the range entered.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
//package naming style.
package com.bridgelabz.util;
import java.util.Scanner;
  //class declaration.
  public class PrimeRange 
{
     static int input1,input2;
     static int flag=0, i,j;
      //input1,input2,flag are variables intialized by datatype.
     //main declaration
       public static void main ( String[] args) {    
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the lower limit");
      input1=scanner.nextInt();
      System.out.println("Enter the upper limit");
      input2=scanner.nextInt();
      System.out.println(" the prime numbers between the entered limit are:");
 
       for(i=input1; i<=input2; i++)
        {
                  for(j=2; j<i;j++)
                   {
                     if(i%j==0)
                     {
                        flag=0;
                        break;
                     }
                   else
                    {
                        flag=1;
                    }
           }
           if(flag==1)
            {
             System.out.println(i);
               }
            }
        }
     }
    
 
