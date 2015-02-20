///////////////////////////////////////////////////////////
//Ryan Kirton
//hw04
//Banking
//
//This program should be able to start the user with a random
//amount of money between 1000 and 5000 dollars.  It should then 
//give the user the choice of depositing, withdrawing or viewing
//the account balance.  
//
//
//

import java.util.Scanner; //create scanner
public class Banking{ //create Banking class
    public static void main(String[] args){ //create main method
        Scanner myScanner; //name scanner
        myScanner=new Scanner(System.in); //define scanner
        
        int randomStart=(int)(Math.random()*(5000 - 1000 + 1)); //start user with random amount
        
        
        String checkBalance="c";//create user inputs
        String deposit="d";
        String withdraw="w";
        
        System.out.print("Would you like to check your balance, deposit money or withdraw money?(c, d or w) ");//prompt user to make choice
        String choice=myScanner.nextLine();//define choice as user input
        
        if (choice==checkBalance){//if the user chose to check balance
            System.out.print(""+randomStart+"\n");//show balance
        }
        else if (choice==deposit){//if user chose to depost
            System.out.print("How much would you like to deposit?  ");//ask user how much
            int addMoney=myScanner.nextInt();//define amount to be added as user input
            int finalBalance=addMoney+randomStart;//create final balance
            System.out.print("The ending balance is $"+finalBalance+"");//print balance
        }
        else if (choice==withdraw){//if user chose to withdraw
            System.out.print("How much would you like to withdraw?  ");//ask user how much
            int removeMoney=myScanner.nextInt();//define amount to be withdrawn as user input
            int fBalance=randomStart-removeMoney;//create final balance
            System.out.print("The ending balance is $"+fBalance+"");//print balance
        }
        else{//in any other case
            System.out.print("Sorry, that is not a valid input.  Please try again.");//print statement
        }
        
        
    }
}