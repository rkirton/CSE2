////////////////////////////////////////////////////////////////////
//Ryan Kirton
//lab08
//Factorials
//
//program will ask user for an integer and reurn its super factorial

import java.util.Scanner;//create scanner

public class Factorials {
    public static void main(String[] args) {//method for 
        Scanner scan = new Scanner(System.in);//define and name scanner
        System.out.print("please enter an integer: ");//request integer
        int sup = scan.nextInt();
        int sum = 0;//will add each factorial
        for(int i = 1; i <= sup; i++){//loop as man times as the number
            sum += factorial(i);//add on each factorial
        }
        print(sum);//print each individual factorial
  }
    public static int factorial(int key){//calculates each factorial
        int mul = 1;
        for (int i = 1; i <= key; i++){//multiplies each part of factorial
            mul *= i;//multiplies by one more untill the entered number
        }
        System.out.println(mul);
        return mul;//output, eavh factorial
    }
    public static void print(int num){//prints out result.
        System.out.println("The super factorial is equal to " + num);
    }//end main method
}//end public class