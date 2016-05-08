////////////////////////////////////////////////////
//Ryan Kirton
//lab3
//check


import java.util.Scanner;
//create scanner

public class Check{//public class
    public static void main (String[] args){//main method
        Scanner myScanner = new Scanner(System.in);//define scanner
        //print statement
        System.out.print("Enter the orginial check amount in the form xx.xx: ");
        //create input double
        double origCheck$= myScanner.nextDouble();
        //print lines
        System.out.println(" ");
        System.out.print("Enter the percent tip that will be paid as a whole number in the form xx: ");
        //input percent
        double percent = myScanner.nextDouble();
        //print lines
        System.out.println(" ");
        System.out.print("Enter the number of people splitting the check: ");
        //input number of people
        int checkSplit = myScanner.nextInt();
        //calculate final cost per person
        double finalCost$= (origCheck$*((percent*.01)+1))/checkSplit;
        //limit decimal
        finalCost$= (int)(finalCost$*100)/100.00;
        //print final cost
        System.out.println("The cost per person will be "+(finalCost$)+" ");
        
        
    }
}