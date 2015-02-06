////////////////////////////////////////
//Ryan Kirton
//Lab03
//Big Mac
//
//This program should be able to take data from the user which tells the 
//cost per big mac, the number of big macs being bought and tax percent
//and be able to tell the total cost of them
//


import java.util.Scanner;

public class BigMac{
    //main method required for every program
    public static void main(String[] args)  {
     //create new scanner
     Scanner myScanner;
     //define new scanner "my scanner" as system input
     myScanner=new Scanner(System.in);
     
     System.out.print("Enter the number of Big Macs (an integer>0):");//prompt user to enter number of Big Macs
     
     int nBigMacs=myScanner.nextInt();//define number of big macs
     
     System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): ");//prompt user to enter big mac cost
     double bigMac$=myScanner.nextDouble();//define big mac cost as the number the user will input
     System.out.print("Enter the percent tax as a whole number (xx): ");//prompt user to enter tax percent
     double taxRate=myScanner.nextDouble();//define tax percent as number user will input
     taxRate/=100; //user enters percent but my program wants proportion
     
     double cost$;//define cost
     int dollars, //whole dollar amount of cost
     dimes, pennies; //for storing digits to the right of the decimal for cost$
     cost$=nBigMacs*bigMac$*(1+taxRate);//create equation for finding total cost
     //get the whole amount, dropping decimal fraction
     dollars=(int)cost$;
     //get dimes amount
     dimes=(int)(cost$*10)%10;
     pennies=(int)(cost$*100)%10;//get pennies amount
     //based on user input print the cost of the big macs
     System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+" per bigMac, with a sales tax of "+(int)(taxRate*100)+"%, is $ "+dollars+"."+dimes+""+pennies+"");
     
     
        
        
        
        
    }
}