
/******************************************************************************
 * Compilation: javac -d bin com/bridgelabz/util/PrintThreeNames.java
 * Execution: java -cp bin com.bridgelabz.util.PrintThreeNames.
 *
 * Purpose: To print the user entered number in an reverese order.
 *
 *  @author  Rivera
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
class PrintThreeNames 
  {
     public static void main(String args[]) {
       String name1 = (args [0]);
       String name2 = (args [1]);
       String name3 = (args [2]);

       System.out.println("The names entered are as follows : "+name3+" "+name2+" "+name1 );
    }

}
