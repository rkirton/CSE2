//////////////////////////////////////////////
//Ryan Kirton
//hw03
//FourDigits
//
//This program should be able to take a double input by the user
//and print out the first four digits that come after the decimal point
//

import java.util.Scanner; //create new scanner

public class FourDigits{
    public static void main(String[] args)  { //main method always required
        
        Scanner myScanner; //define scanner as myScanner
        myScanner=new Scanner(System.in); //create input for user
        
        //ask the user to enter a number
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
        double mainNumber=myScanner.nextDouble();//define the "mainNumber" as the number input by user
        
        
        int fixedMainNumber;//create the integer fixedMainNumber
        fixedMainNumber=(int)(mainNumber*10000);//define and create an equation for fixedMainNumber
        
        //print out the first four digits after the decimal point
        System.out.print("The four digits are "+fixedMainNumber%10000+"\n");
        
        
    }
}