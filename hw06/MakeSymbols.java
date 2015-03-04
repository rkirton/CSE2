///////////////////////////////////////////////////////////////
//Ryan Kirton
//hw06
//MakeSymbols
//
//This program should be able to create a random number from 0 to 100.
//From there if it is an even number it should be able to print a "*"
//the same number of times as the integer.  If it is odd it should be
//able to print a "&" the same number of times as the integer.
//
//
//

public class MakeSymbols{//public class always required
    public static void main(String[] args){//main method always required
        
        int mainInteger;//create integer "mainInteger"
        
        mainInteger=1+(int)(Math.random()*100);//define integer as random int from 1 to 100
        
        System.out.print(mainInteger+"\n");//print the random number
        
        int leftovers=mainInteger%2;
        //create the integer "leftovers" and define it as the remainder if the mainInt is divided by 2
        
        if (leftovers==0){//if there are no "leftovers" (number is even)
            do{//start do-while loop
                System.out.print("*");//print a * until mainInteger runs out
                mainInteger--;//subtract 1 from mainInt each time
                }while (mainInteger>0);//end the while loop with the boolean
        }
        
        if (leftovers==1){//if the number is odd
            do{//start the do-while loop
                System.out.print("&");//print a & until mainInteger runs out
                mainInteger--;//subtract 1 from the main integer
            }while (mainInteger>0);//end the while loop with the boolean
        }
        
        
    }
}