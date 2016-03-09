//////////////////////////////////////////////////////////
//Ryan Kirton
//hw06
//RunFactorial
//
//This program should be able to take and input from the user between 
//9 and 16 and print its factorial value.

//create scanner
import java.util.Scanner;
//public class
public class RunFactorial{
    public static void main(String[] args){//main method
        
        //define and name scanner
        Scanner myScanner = new Scanner(System.in);
        //prompt user for input
        System.out.println("Please enter an integer that is between 9 and 16: ");
        
        boolean badInput = true;
        int goodValue = 0;
        //this while loop checks for good input
        while(badInput){
            if(myScanner.hasNextInt()){
                goodValue = myScanner.nextInt();
                if(goodValue<9 || goodValue>16){
                    System.out.println("Not withing correct range.  Try again.");
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
        
        int printValue = goodValue;
        
        int next = 1;
        //calculate the factorial with this while loop
        while(goodValue>0){
            next = next*goodValue;
            goodValue--;
            
        }
        //print the value
        System.out.println("Input accepted: ");
        System.out.println(""+(printValue)+"! = "+(next)+"");
        
        
        
        
        
    }
}