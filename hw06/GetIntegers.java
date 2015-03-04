///////////////////////////////////////////////////////////////
//Ryan Kirton
//hw06
//GetIntegers
//
//This program should be able to take 5 non-negative integers 
//and print their sum (using for loops).
//

import java.util.Scanner;//create scanner

public class GetIntegers{//public class always required
    public static void main(String[] args){//main method always required
        
        Scanner myScanner=new Scanner(System.in);//define and name scanner
        
        System.out.println("Please enter 5 non-negative integers:");//print the statement
        
        int sum=0;//create integer sum and initialize it at 0
            
            
            
        for (int n=0; n<5; n++){//create for loop for n from 0 to 5, adding 1 each time
            String number1=myScanner.nextLine();//define "number1" as next input from user
            int finalNumber1=Integer.parseInt(number1);//chang number1 to int and check to make sure its an int
            
            sum=sum+finalNumber1;//define sum as the old sum plus the next number
            
        }
        
        
        System.out.println("Sum is: " +sum+ "");//print the final sum
        
        
        
        
        
        
    }
}