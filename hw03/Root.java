/////////////////////////////////////////////////
//Ryan Kirton
//hw03
//Root
//
//
//
//

import java.util.Scanner; //create new scanner

public class Root{ //public class required for every program
    public static void main(String[] args)  { //main method always required
        
        Scanner myScanner; //define scanner as myScanner
        myScanner=new Scanner(System.in); //create input for user
        
        System.out.print("Enter a number: ");//prompt user to enter number
        double mainNumber=myScanner.nextInt();//define mainNumber as number input by user
        double guess;//create variable guess
        guess=mainNumber/3;//define guess as the number divided by 3
        double x;//create variable x
        x=(guess*guess*guess+mainNumber)/(3*guess*guess);//refine overall guess using initial gues
        double y;//create variable y
        y=(2*x*x*x+mainNumber)/(3*x*x);//refine overall guess using x
        double z;//create variable z
        z=(2*y*y*y+mainNumber)/(3*y*y);//refine overall guess using y
        double a;//create variable a
        a=(2*z*z*z+mainNumber)/(3*z*z);//refine guess using z
        double b;//create variable b
        b=(2*a*a*a+mainNumber)/(3*a*a);//refine guess using b
        
        
        System.out.print("The cube root is: "+b+"\n");//print the cube root guess
        
        System.out.print(+b+"*"+b+"*"+b+"="+b*b*b+"\n");//show the calculation of the guess cubed
        
        
    }
}