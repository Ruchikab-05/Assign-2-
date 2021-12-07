/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);     /** Createing  a reader instance which takes 
	                                               input from standard input - keyboard**/
	    System.out.println("Enter a num1: ");      //prints the line to output screen
	    int num1 = reader.nextInt();               // nextInt() reads the next integer from the keyboard

	     System.out.println("Enter a num2: ");     //prints the line to output screen
	     int num2 = reader.nextInt();           // nextInt() reads the next integer from the keyboard
  
	     
	    System.out.println(" your enter num1: "+ num1);
	    System.out.println("your enter num2: "+ num2);
	    
	    int sum = num1 + num2;                    // adding two numbers
	    System.out.println("sum is: " + sum);     // getting sum output
	}
}
