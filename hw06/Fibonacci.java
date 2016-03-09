//////////////////////////////////////////////////////
//Ryan Kirton
//hw06
//Fibonacci
//
//This program should be able to take three inputs from the user
//which represent the first two numbers in a Fibonaci Sequence
//and the amount of numbers to be displayed.  It should then 
//display the corresponding sequence.

import java.util.Scanner;//create scanner

public class Fibonacci{//create public class
    public static void main(String[] args){//create main method
        
        Scanner myScanner = new Scanner(System.in);//name and define scanner
        
        //prompt user for first input
        System.out.println("Enter the first number in the sequence: ");
        //take first input
        
        boolean badInput1 = true;
        int goodA = 0;
        //this while loop checks for good input
        while(badInput1){
            if(myScanner.hasNextInt()){
                goodA = myScanner.nextInt();
                if(goodA<1){
                    System.out.println("Not a positive integer.  Try again.");
                    myScanner.nextLine();
                }
                else{
                    badInput1 = false;
                    break;
                    }
            }
            else{
                System.out.println("Not an int.  Try again.");
                myScanner.nextLine();
            }
        }
        
        
        
        //prompt user for second input
        System.out.println("Enter the second number in the sequence: ");
        
        boolean badInput2 = true;
        int goodB = 0;
        //this while loop checks for good input
        while(badInput2){
            if(myScanner.hasNextInt()){
                goodB = myScanner.nextInt();
                if(goodB<1){
                    System.out.println("Not a positive integer.  Try again.");
                    myScanner.nextLine();
                }
                else if(goodB<goodA){
                    System.out.println("Must be at least as large as the first number.");
                }
                else{
                    badInput2 = false;
                    break;
                    }
            }
            else{
                System.out.println("Not an int.  Try again.");
                myScanner.nextLine();
            }
        }
        
        
        
        //prompt user for third input
        System.out.println("How many custom Fibonacci numbers should be printed? ");
        
        boolean badInput3 = true;
        int goodC = 0;
        
        //this while loop checks for good input
        while(badInput3){
            if(myScanner.hasNextInt()){
                goodC = myScanner.nextInt();
                if(goodC<1){
                    System.out.println("Not a positive integer.  Try again.");
                    myScanner.nextLine();
                }
                else{
                    badInput3 = false;
                    break;
                    }
            }
            else{
                System.out.println("Not an int.  Try again.");
                myScanner.nextLine();
            }
        }
        
        
        
        
        //print out the first two numbers
        System.out.println("The numbers are: ");
        System.out.print(""+(goodA)+", ");
        System.out.print(""+(goodB)+"");
        //create variables for adding each new value
        int add = goodA;
        int next = 0;
        int last = goodB;
        //while loop to run the amount of times the user wanted values, minus
        //the first two values
        while(goodC-2>0){
            next = add + last;//create next value to be displayed and then print it
            System.out.print(", "+(next)+"");
            //shift each number over by one place to find the next number
            add = last;
            last = next;
            //subtract one from goodC
            goodC--;
        }
        
        //print a final period
        System.out.println(".");
        
        
    }
}