//////////////////////////////////////////////////////////
//Ryan Kirton
//hw04
//Which Number
//
//This program should be able to figure out a number (between 1 and 10)
//that the user is thinking of based on their responses to several questions.
//
//

import java.util.Scanner; //create scanner

public class WhichNumber{//name program
    public static void main(String[] args){//main method always required
        Scanner myScanner;//name scanner
        myScanner=new Scanner(System.in);//define scanner values as user input
        
        System.out.print("Think of a number between 1 and 10 inclusive\n");//print statement
        
        String yes="y";//create yes string
        String Yes="Y";//create Yes string
        String no="n";//create no string
        String No="N";//create No string
        
        System.out.print("Is your number even?(y or n) ");//ask if number is even
        String evenOrOdd=myScanner.nextLine();//define string as user input
        
        
        
        if (evenOrOdd.equals(yes) || evenOrOdd.equals(Yes)){//if its even
            System.out.print("Is your number divisible by 4?(y or n) ");//print statement
            String divBy4=myScanner.nextLine();//define string as user input
            
            if (divBy4.equals(yes) || divBy4.equals(Yes)){//if its div by 4
                System.out.print("Is your number greater than 5?(y or n) ");//print statement
                String greaterThan5=myScanner.nextLine();//define string as user input
                
                if (greaterThan5.equals(yes) || greaterThan5.equals(Yes)){//if its greater than 5
                    System.out.print("Your number is 8");//print statement
                }
                if (greaterThan5.equals(no) || greaterThan5.equals(No)){//if its not greater than 5
                    System.out.print("Your number is 4");//print statement
                }
                //else
                //System.out.print("Sorry that is not a valid input");
            }
            if (divBy4.equals(no) || divBy4.equals(No)){//if its not divisible by 4
                System.out.print("Is your number divisble by 3?(y or n) ");//print statement
                String divBy3=myScanner.nextLine();//define string as user input
                
                if (divBy3.equals(yes) || divBy3.equals(Yes)){//if its divisible by 3
                    System.out.print("Your number is 6");//print statement
                }
                if (divBy3.equals(no) || divBy3.equals(No)){//if its divisible by 3
                    System.out.print("Is your number divisble by 5?(y or n) ");//print statement
                    String divBy5=myScanner.nextLine();//define string as user input
                
                    
                    if (divBy5.equals(yes) || divBy5.equals(Yes)){//if its divisible by 5
                        System.out.print("Your number is 10");//print statement
                    }
                    if (divBy5.equals(no) || divBy5.equals(No)){//if its not divisible by 5
                        System.out.print("Your number is 2");//print statement
                    }
                    //else
                    //System.out.print("Sorry that is not a valid input");
                }
                //else
                //System.out.print("Sorry that is not a valid input");
                
            }
            //else
            //System.out.print("Sorry that is not a valid input");
            
        }
        if (evenOrOdd.equals(no) || evenOrOdd.equals(No)){//if its odd
            System.out.print("Is your number divisble by 3?(y or n) ");//print statement
            String divisbleBy3=myScanner.nextLine();//define string as user input
            
            if (divisbleBy3.equals(yes) || divisbleBy3.equals(Yes)){//if its div by 3
                System.out.print("Is your number prime?(y or n) ");//print statement
                String isItPrime=myScanner.nextLine();//define string as user input
                
                if (isItPrime.equals(yes) || isItPrime.equals(Yes)){//if its prime
                    System.out.print("Your number is 3");//print statement
                }
                if (isItPrime.equals(no) || isItPrime.equals(No)){//if its not prime
                    System.out.print("Your number is 9");//print statement
                }
                //else
                //System.out.print("Sorry that is not a valid input");
            }    
            if (divisbleBy3.equals(no) || divisbleBy3.equals(No)){//if its not div by 3
                System.out.print("Is your number more than 4?(y or n) ");//print statement
                String moreThan4=myScanner.nextLine();//define string as user input
                
                if (moreThan4.equals(yes) || moreThan4.equals(Yes)){//if its more than 4
                    System.out.print("Is your number a factor of 10?(y or n) ");//print statement
                    String factorOf10=myScanner.nextLine();//define string as user input
                    
                    if (factorOf10.equals(yes) || factorOf10.equals(Yes)){//if its a factor of 10
                        System.out.print("Your number is 5");//print statement
                    }
                    if (factorOf10.equals(no) || factorOf10.equals(No)){//if its not a factor of 10
                        System.out.print("Your number is 10");//print statement
                    }
                    //else
                    //System.out.print("Sorry that is not a valid input");
                }
                if (moreThan4.equals(no) || moreThan4.equals(No)){//if its not more than 4
                    System.out.print("Your number is 1");//print statement
                    
                }    
                //else
                //System.out.print("Sorry that is not a valid input");
            }
            //else
            //System.out.print("Sorry that is not a valid input");    
        }
        else{//if the input is anything other than y Y n or N
        System.out.print("Sorry that is not a valid input");//print statement
            
        }
        
    }
}