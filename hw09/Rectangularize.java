////////////////////////////////////////////
//Ryan Kirton
//hw09
//Rectangularize
//
//This program should be able to take user input in a string or int.
//If its a string it should print the string the number of times that
//there are letters in it.  If its an int it should print % in a square
//the number of times the int is.
//

import java.util.Scanner;//create scanner

public class Rectangularize{//public class
    public static void main(String[] args){//main method
        Scanner myScanner = new Scanner(System.in);//define and name scanner
        
        System.out.println("Please enter an input");//prompt user
        
        int number;//initialize int
        String userWord;//initialize string
        
        if(myScanner.hasNextInt()){//if its and int
            number = myScanner.nextInt();//take users int
            rectangular(number);//call method
        }
        else{//if its a string
            userWord = myScanner.next();//take the users string
            rectangular(userWord);//call method
        }
        
        
        
    }    
    
    public static void rectangular(int square){//method for int input
        
        System.out.println("Output:");
        System.out.println("");
        
        for(int i=0; i<square; i++){//print out the number of lines
            for(int j=0; j<square; j++){//number of % per line
                System.out.print("%");
            }
            System.out.println("");
        }
        
    }
    
    public static void rectangular(String word){//method for string input
        
        System.out.println("Output:");
        System.out.println("");
        int count = word.length();//create an int for the word length
        
        for(int i=0; i<count; i++){//print out the word "count" number of times
            System.out.println(word);
        }
        
    }
    
    
    
}