//////////////////////////////////////////////////////////////
//Ryan Kirton
//hw06
//RunFactorial
//
//This program should be able to take an integer value from the user
//between 9 and 16 and print out its factorial value.
//
//

import java.util.Scanner;//create a scanner

public class RunFactorial{//class always required
    public static void main(String[] args){//main method always required
        
        Scanner myScanner=new Scanner(System.in);//define and name the scanner
        
        System.out.println("Please enter an integer that is between 9 and 16: ");//print the statement
        
        int mainInteger=myScanner.nextInt();//define "mainInteger" as the input by the user
        
        if (mainInteger>8 && mainInteger<17){//if mainInteger is between 9 and 16 continue
            
        }
        else{//in any other event...
            System.out.println("Invalid input. Please try again.");//print the statement
            return;//terminate the program
        }
        
        int useInt=mainInteger;//define "useInt" as the same as "mainInteger"
        
        double factorial = 1;//create the variable "factorial" and initially define it as=1
        
        while (useInt > 1){//create while loop for useInt>1
            
            factorial = factorial * mainInteger; //multiply the factorial by the mainInt, redefining "factorial" each time the loop runs
            mainInteger--;//subtract 1 from the mainInt
            
        }
        
        System.out.println("Input accepted:\n" + mainInteger + "!=" + factorial + "");//print the statement with the initial mainInt and the final factorial value
        
    }
}