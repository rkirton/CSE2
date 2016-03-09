/////////////////////////////////////////////////////////////
//Ryan Kirton
//lab06
//TwistGenerator
//
//Based on the input from the user, this program will print
//out a pattern with the length of the user input.
//

import java.util.Scanner;

public class TwistGenerator{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("Please enter a positive integer");
        boolean badInput = true;
        int length = 0;
        
        while(badInput){
            if(myScanner.hasNextInt()){
                length = myScanner.nextInt();
                if(length<1){
                    System.out.println("Not a positive integer.  Try again.");
                    myScanner.nextLine();
                }
                else{
                    badInput = false;
                    break;
                    }
            }
            else{
                System.out.println("Not an int.  Try again.");
                myScanner.nextLine();
            }
        }
        
        
       
        int setThrees = length/3;
        int remainder = length - (setThrees*3);
        
        int threes = setThrees;
        
        while(threes>0){
            System.out.print("\\ /");
            threes--;
        }
        
        if( remainder == 2 || remainder == 1 ){
            System.out.print("\\ ");
        }
        
        System.out.println(" ");
        threes = setThrees;
        
        while(threes>0){
            System.out.print(" X ");
            threes --;
        }
        
        System.out.println(" ");
        threes = setThrees;
        
        while(threes>0){
            System.out.print("\\ /");
            threes--;
        }
        
        if( remainder == 2 || remainder == 1 ){
            System.out.print("\\ ");
        }
        System.out.println("");
        
        
        
    }
}